package com.example.design.patterns.structural.decorator;

public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String make() {
        return sandwich.make() + addChicken();
    }

    private String addChicken() {
        return "+Chicken";
    }
}
