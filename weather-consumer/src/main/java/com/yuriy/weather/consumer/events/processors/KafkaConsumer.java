package com.yuriy.weather.consumer.events.processors;

import com.yuriy.weather.entities.WeatherEntity;
import com.yuriy.weather.publisher.events.schemas.WeatherMessageData;
import com.yuriy.weather.consumer.services.WeatherService;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class KafkaConsumer implements Consumer {

    private final WeatherService weatherService;

    public KafkaConsumer(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Override
    @StreamListener(Processor.INPUT)
    public void consumeWeatherRecord(WeatherMessageData weatherMessage) {
        WeatherEntity weatherRecord = WeatherEntity.builder()
                .country(weatherMessage.getCountry().toString())
                .city(weatherMessage.getCity().toString())
                .temperature(weatherMessage.getTemperature())
                .humidity(weatherMessage.getHumidity())
                .windSpeed(weatherMessage.getWindSpeed())
                .cloudy(weatherMessage.getCloudy().toString())
                .time(LocalDateTime.ofEpochSecond(weatherMessage.getTime(), 0, ZoneOffset.UTC))
                .build();
        weatherService.storeWeatherRecord(weatherRecord);
    }

}
