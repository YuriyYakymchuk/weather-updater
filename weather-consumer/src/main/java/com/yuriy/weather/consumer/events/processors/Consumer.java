package com.yuriy.weather.consumer.events.processors;

import com.yuriy.weather.events.models.WeatherMessageData;

public interface Consumer {

    void consumeWeatherRecord(WeatherMessageData weatherMessage);

}
