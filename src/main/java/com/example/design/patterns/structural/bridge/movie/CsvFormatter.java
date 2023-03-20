package com.example.design.patterns.structural.bridge.movie;

import java.util.List;
import java.util.stream.Collectors;

public class CsvFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        return header + "," + details.stream().map(this::translate).collect(Collectors.joining(","));
    }

    private String translate(Detail detail) {
        return detail.getLabel() + "," + detail.getValue();
    }
}
