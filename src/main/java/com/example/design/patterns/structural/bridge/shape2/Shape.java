package com.example.design.patterns.structural.bridge.shape2;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public void applyColor() {
        color.apply(this);
    }

    public abstract ShapeType getType();

}
