package com.example.design.oo.example.converter;

public class Mi2KmConverter extends AbstractConverter {

    @Override
    protected double getConversionRate() {
        return 1.609;
    }
}
