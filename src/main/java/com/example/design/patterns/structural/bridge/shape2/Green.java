package com.example.design.patterns.structural.bridge.shape2;

public class Green implements Color {
    @Override
    public void apply(Shape shape) {
        System.out.println("Applying Green to "+shape.getType());
    }
}
