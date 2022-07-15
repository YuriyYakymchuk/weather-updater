package com.yuriy.weather.publisher.services;

import com.yuriy.weather.publisher.models.WeatherData;

public interface WeatherService {

    boolean publishWeatherMessage(WeatherData weatherDataRecord);
}
