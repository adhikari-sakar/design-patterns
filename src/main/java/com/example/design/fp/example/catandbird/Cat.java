package com.example.design.fp.example.catandbird;

public class Cat {

    public CatWithCatch capture(Bird bird) {
        return new CatWithCatch(bird);
    }
}
