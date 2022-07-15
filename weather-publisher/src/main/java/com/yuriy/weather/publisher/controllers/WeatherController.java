package com.yuriy.weather.publisher.controllers;

import com.yuriy.weather.publisher.models.WeatherData;
import com.yuriy.weather.publisher.services.WeatherService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final String config;

    private final WeatherService weatherService;

    public WeatherController(@Value("${config.test}") final String config, final WeatherService weatherService) {
        this.config = config;
        this.weatherService = weatherService;
    }

    @PostMapping
    public ResponseEntity<WeatherData> createWeatherRecord(@RequestBody WeatherData weatherData) {
        boolean result = weatherService.publishWeatherMessage(weatherData);

        return ResponseEntity.status(result ? HttpStatus.CREATED : HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @GetMapping("/config")
    public ResponseEntity<String> getConfig() {
        return ResponseEntity.ok(config);
    }
}
