package com.yuriy.weather.publisher.events.processors;

import com.yuriy.weather.publisher.models.WeatherData;

public interface Producer {

    boolean produceWeatherMessage(WeatherData weatherData);

}
