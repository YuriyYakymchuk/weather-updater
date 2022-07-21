package com.yuriy.weather.measurement.dao;

import com.yuriy.weather.entities.WeatherEntity;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class WeatherSpecification {

    private LocalDate date;

    private String country;

    private List<String> cities;

    private WeatherSpecification(LocalDate date, String country, List<String> cities) {
        this.date = date;
        this.country = country;
        this.cities = cities;
    }

    public Specification<WeatherEntity> buildSpecification() {
        Specification<WeatherEntity> specification = (weather, query, builder) -> buildDefaultPredicate(weather, builder);

        if (country != null) {
            specification = specification.and((weather, query, builder) -> builder.equal(builder.lower(weather.get("country")), country));
        }

        if (cities != null) {
            specification = specification.and((weather, query, builder) -> builder.lower(weather.get("city")).in(cities));
        }

        if (date != null) {
            specification = specification.and((weather, query, builder) ->
                    builder.between(weather.get("time"), date.atStartOfDay(), LocalDateTime.of(date, LocalTime.MAX)));
        }

        return specification;
    }

    private Predicate buildDefaultPredicate(Root<WeatherEntity> weatherRoot, CriteriaBuilder builder) {
        return builder.isNotNull(weatherRoot.get("id"));
    }

    public static WeatherSpecificationBuilder builder() {
        return new WeatherSpecificationBuilder();
    }

    public static class WeatherSpecificationBuilder {

        private LocalDate date;

        private String country;

        private List<String> cities;

        private WeatherSpecificationBuilder() {
        }

        public WeatherSpecificationBuilder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public WeatherSpecificationBuilder country(String country) {
            this.country = country != null ? country.toLowerCase() : null;
            return this;
        }

        public WeatherSpecificationBuilder cities(List<String> cities) {
            this.cities = cities != null ? cities.stream().map(String::toLowerCase).collect(Collectors.toList()) : null;
            return this;
        }

        public WeatherSpecification build() {
            return new WeatherSpecification(date, country, cities);
        }
    }
}
