package com.yuriy.weather.publisher.services;

import com.yuriy.weather.publisher.events.processors.Producer;
import com.yuriy.weather.publisher.models.WeatherData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {

    private final Producer producer;

    public WeatherServiceImpl(Producer producer) {
        this.producer = producer;
    }

    @Override
    public boolean publishWeatherMessage(WeatherData weatherDataRecord) {
        boolean result =  producer.produceWeatherMessage(weatherDataRecord);
        log.info(String.format("Result of publishing the message (%s): %s", weatherDataRecord, result ? "Success" : "Failure"));
        return result;
    }

}
