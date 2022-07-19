package com.yuriy.weather.consumer.events.processors;

import com.yuriy.weather.consumer.events.model.WeatherMessageData;

public interface Consumer {

    void consumeWeatherRecord(WeatherMessageData weatherMessage);

}
