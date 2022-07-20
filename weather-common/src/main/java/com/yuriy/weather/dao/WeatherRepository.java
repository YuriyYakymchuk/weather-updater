package com.yuriy.weather.dao;

import com.yuriy.weather.entities.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<WeatherEntity, Integer> {
}
