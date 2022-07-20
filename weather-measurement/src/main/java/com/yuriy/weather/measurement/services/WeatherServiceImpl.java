package com.yuriy.weather.measurement.services;

import com.yuriy.weather.dao.WeatherRepository;
import com.yuriy.weather.measurement.models.WeatherRecord;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public List<WeatherRecord> retrieveWeatherData() {
        return weatherRepository.findAll().stream()
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

}
