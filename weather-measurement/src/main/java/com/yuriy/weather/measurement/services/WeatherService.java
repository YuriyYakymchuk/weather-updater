package com.yuriy.weather.measurement.services;

import com.yuriy.weather.measurement.models.WeatherRecord;

import java.util.List;

public interface WeatherService {

    List<WeatherRecord> retrieveWeatherData();

}
