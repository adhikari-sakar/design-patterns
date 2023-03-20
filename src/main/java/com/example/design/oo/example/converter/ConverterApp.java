package com.example.design.oo.example.converter;

import java.util.ArrayList;
import java.util.List;

public class ConverterApp {

    private List<Double> convertValues(List<Double> values, Converter converter) {
        List<Double> convertedValues = new ArrayList<>();
        for (Double value : values) {
            convertedValues.add(converter.convert(value));
        }
        return convertedValues;
    }

    public static void main(String[] args) {
        ConverterApp app = new ConverterApp();
        List<Double> values = List.of(10.0, 20.0, 50.0);
        List<Double> convertedDistances = app.convertValues(values, new Mi2KmConverter());
        List<Double> convertedWeights = app.convertValues(values, new Ou2GmConverter());
    }
}
