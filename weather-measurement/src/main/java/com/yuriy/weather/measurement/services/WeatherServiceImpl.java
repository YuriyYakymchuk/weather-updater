package com.yuriy.weather.measurement.services;

import com.yuriy.weather.dao.WeatherRepository;
import com.yuriy.weather.measurement.dao.SortOption;
import com.yuriy.weather.measurement.dao.WeatherSpecification;
import com.yuriy.weather.measurement.models.WeatherRecord;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final WeatherRepository weatherRepository;

    public WeatherServiceImpl(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<WeatherRecord> retrieveWeatherData(LocalDate date, String country, List<String> cities, List<SortOption> sortOptions) {
        WeatherSpecification weatherSpecification = WeatherSpecification.builder()
                .date(date)
                .country(country)
                .cities(cities)
                .build();

        return weatherRepository.findAll(weatherSpecification.buildSpecification(), Sort.by(buildSortOrders(sortOptions))).stream()
                .map(weatherEntity -> WeatherRecord.builder()
                        .country(weatherEntity.getCountry())
                        .city(weatherEntity.getCity())
                        .temperature(weatherEntity.getTemperature())
                        .humidity(weatherEntity.getHumidity())
                        .windSpeed(weatherEntity.getWindSpeed())
                        .cloudy(weatherEntity.getCloudy())
                        .time(weatherEntity.getTime())
                        .createdAt(weatherEntity.getCreatedAt())
                        .build())
                .collect(Collectors.toList());
    }

    private List<Sort.Order> buildSortOrders(List<SortOption> sortOptions) {
        List<Sort.Order> orders = new ArrayList<>();
        if (sortOptions == null) {
            orders.add(new Sort.Order(Sort.Direction.ASC, "id"));
            return orders;
        }

        return sortOptions.stream()
                .map(sortOption -> new Sort.Order(sortOption.getDirection(), sortOption.getColumn()))
                .collect(Collectors.toList());
    }

}
