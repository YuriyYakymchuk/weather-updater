package com.yuriy.weather.measurement.converters;

import com.yuriy.weather.measurement.dao.SortOption;
import org.springframework.core.convert.converter.Converter;

public class SortOptionConverter implements Converter<String, SortOption> {

    @Override
    public SortOption convert(String sort) {
        return SortOption.findSortOption(sort);
    }

}
