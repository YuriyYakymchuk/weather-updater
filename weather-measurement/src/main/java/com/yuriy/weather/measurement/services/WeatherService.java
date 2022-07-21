package com.yuriy.weather.measurement.services;

import com.yuriy.weather.measurement.dao.SortOption;
import com.yuriy.weather.measurement.models.WeatherRecord;

import java.time.LocalDate;
import java.util.List;

public interface WeatherService {

    List<WeatherRecord> retrieveWeatherData(LocalDate date, String country, List<String> cities, List<SortOption> sortOptions);

}
