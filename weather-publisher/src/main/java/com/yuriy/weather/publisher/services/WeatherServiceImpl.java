package com.yuriy.weather.publisher.services;

import com.yuriy.weather.publisher.events.processors.Producer;
import com.yuriy.weather.publisher.models.WeatherData;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final Producer producer;

    public WeatherServiceImpl(Producer producer) {
        this.producer = producer;
    }

    @Override
    public boolean publishWeatherMessage(WeatherData weatherDataRecord) {
        return producer.produceWeatherMessage(weatherDataRecord);
    }

}
