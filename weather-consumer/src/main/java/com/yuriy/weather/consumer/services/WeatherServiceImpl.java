package com.yuriy.weather.consumer.services;

import com.yuriy.weather.dao.WeatherRepository;
import com.yuriy.weather.entities.WeatherEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {

    private final WeatherRepository weatherRepository;

    public WeatherServiceImpl(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Override
    @Transactional
    public void storeWeatherRecord(WeatherEntity weather) {
        log.info("Saving the weather record: " + weather);
        weatherRepository.save(weather);
    }
}
