package com.example.design.patterns.structural.bridge.shape2;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.SQUARE;
    }
}
