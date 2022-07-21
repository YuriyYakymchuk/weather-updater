package com.yuriy.weather.measurement.controllers;

import com.yuriy.weather.measurement.dao.SortOption;
import com.yuriy.weather.measurement.models.WeatherRecord;
import com.yuriy.weather.measurement.services.WeatherService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public ResponseEntity<List<WeatherRecord>> retrieveWeatherMeasurements(
            @RequestParam(name = "date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestParam(name = "country", required = false) String country,
            @RequestParam(name = "city", required = false) List<String> cities,
            @RequestParam(name = "sort", required = false) List<SortOption> sortOptions) {

        return ResponseEntity.ok(weatherService.retrieveWeatherData(date, country, cities, sortOptions));

    }
}
