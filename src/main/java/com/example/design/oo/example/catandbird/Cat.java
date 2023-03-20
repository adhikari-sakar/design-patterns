package com.example.design.oo.example.catandbird;

public class Cat {
    private Bird bird;
    private boolean isFull;

    private void capture(Bird bird) {
        this.bird = bird;
    }

    private void eat() {
        this.bird = null;
        this.isFull = true;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        cat.capture(bird);
        cat.eat();
    }
}
