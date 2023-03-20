package com.example.design.patterns.structural.bridge.shape2;

public class Red implements Color {
    @Override
    public void apply(Shape shape) {
        System.out.println("Applying Red Color to "+shape.getType());
    }
}
