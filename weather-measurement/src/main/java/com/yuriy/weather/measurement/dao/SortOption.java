package com.yuriy.weather.measurement.dao;

import org.springframework.data.domain.Sort;

public enum SortOption {

    CITY_ASC("city", Sort.Direction.ASC, "city"),
    CITY_DESC("-city", Sort.Direction.DESC, "city"),
    TIME_ASC("time", Sort.Direction.ASC, "time"),
    TIME_DESC("-time", Sort.Direction.DESC, "time");

    SortOption(String value, Sort.Direction direction, String column) {
        this.value = value;
        this.direction = direction;
        this.column = column;
    }

    private final String value;
    private final Sort.Direction direction;
    private final String column;

    public String getValue() {
        return value;
    }

    public Sort.Direction getDirection() {
        return direction;
    }

    public String getColumn() {
        return column;
    }

    public static SortOption findSortOption(String value) {
        for (SortOption sortOption : values()) {
            if (sortOption.getValue().equals(value)) {
                return sortOption;
            }
        }
        throw new IllegalArgumentException("Sort option is not supported: " + value);
    }
}
