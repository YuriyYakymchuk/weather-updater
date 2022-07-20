package com.yuriy.weather.measurement.controllers;

import com.yuriy.weather.measurement.models.WeatherRecord;
import com.yuriy.weather.measurement.services.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public ResponseEntity<List<WeatherRecord>> retrieveWeatherMeasurements() {
        return ResponseEntity.ok(weatherService.retrieveWeatherData());
    }
}
