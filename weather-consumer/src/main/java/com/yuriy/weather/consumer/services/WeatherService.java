package com.yuriy.weather.consumer.services;


import com.yuriy.weather.entities.WeatherEntity;

public interface WeatherService {

    void storeWeatherRecord(WeatherEntity weather);

}
