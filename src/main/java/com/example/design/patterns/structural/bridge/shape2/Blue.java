package com.example.design.patterns.structural.bridge.shape2;

public class Blue implements Color {

    @Override
    public void apply(Shape shape) {
        System.out.println("Applying Blue color to " + shape.getType());
    }
}
