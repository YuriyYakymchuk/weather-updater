package com.yuriy.weather.consumer.events.processors;

import com.yuriy.weather.publisher.events.schemas.WeatherMessageData;

public interface Consumer {

    void consumeWeatherRecord(WeatherMessageData weatherMessage);

}
