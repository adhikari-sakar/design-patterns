package com.example.design.patterns.structural.bridge.shape2;

public class BridgeDemo {
    public static void main(String[] args) {

        Shape redCircle = new Circle(new Red());
        Shape blueSquare = new Square(new Blue());
        Shape greenSquare = new Square(new Green());

        redCircle.applyColor();
        blueSquare.applyColor();
        greenSquare.applyColor();
    }
}
