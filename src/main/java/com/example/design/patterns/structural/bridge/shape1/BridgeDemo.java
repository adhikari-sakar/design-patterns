package com.example.design.patterns.structural.bridge.shape1;

public class BridgeDemo {
    public static void main(String[] args) {
        Circle redCircle = new RedCircle();
        Square blueSquare = new BlueSquare();
        Square greenSquare = new GreenSquare();

        redCircle.applyColor();
        blueSquare.applyColor();
        greenSquare.applyColor();
    }
}
