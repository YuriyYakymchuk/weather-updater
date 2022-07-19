package com.yuriy.weather.consumer.dao;

import com.yuriy.weather.consumer.entities.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<WeatherEntity, Integer> {
}
