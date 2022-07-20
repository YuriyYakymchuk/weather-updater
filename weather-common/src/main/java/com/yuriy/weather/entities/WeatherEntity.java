package com.yuriy.weather.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity(name = "Weather")
@Table(name = "Weather")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Country")
    private String country;

    @Column(name = "City")
    private String city;

    @Column(name = "Temperature")
    private Double temperature;

    @Column(name = "Humidity")
    private Integer humidity;

    @Column(name = "WindSpeed")
    private Integer windSpeed;

    @Column(name = "Cloudy")
    private String cloudy;

    @Column(name = "Time")
    private LocalDateTime time;

    @Column(name = "CreatedAt")
    private LocalDateTime createdAt;

}
