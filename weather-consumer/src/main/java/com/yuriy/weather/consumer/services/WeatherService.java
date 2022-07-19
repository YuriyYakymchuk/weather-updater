package com.yuriy.weather.consumer.services;

import com.yuriy.weather.consumer.entities.WeatherEntity;

public interface WeatherService {

    void storeWeatherRecord(WeatherEntity weather);

}
