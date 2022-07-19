package com.yuriy.weather.publisher.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WeatherData {

    private String country;

    private String city;

    private double temperature;

    private int humidity;

    private int windSpeed;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;

    private String cloudy;

}
