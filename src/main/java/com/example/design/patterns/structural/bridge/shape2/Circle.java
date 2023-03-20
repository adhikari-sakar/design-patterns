package com.example.design.patterns.structural.bridge.shape2;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.CIRCLE;
    }
}
