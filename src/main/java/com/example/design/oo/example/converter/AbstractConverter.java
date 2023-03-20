package com.example.design.oo.example.converter;

public abstract class AbstractConverter implements Converter {

    @Override
    public double convert(double value) {
        return value * getConversionRate();
    }

    protected abstract double getConversionRate();
}
