package com.example.design.patterns.structural.bridge.movie;

import java.util.List;
import java.util.stream.Collectors;

public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        return "<td>" + header + "," + details.stream().map(this::translate).collect(Collectors.joining(",")) + "</td>";
    }

    private String translate(Detail detail) {
        return detail.getLabel() + ": " + detail.getValue();
    }
}
