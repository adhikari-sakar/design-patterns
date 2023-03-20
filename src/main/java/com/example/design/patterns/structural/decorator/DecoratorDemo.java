package com.example.design.patterns.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Sandwich chickenCheeseSandwich = new MeatDecorator(new CheeseDecorator(new SimpleSandwich()));
        Sandwich cheeseSandwich = new CheeseDecorator(new SimpleSandwich());
        System.out.println(chickenCheeseSandwich.make());
        System.out.println(cheeseSandwich.make());
    }
}
