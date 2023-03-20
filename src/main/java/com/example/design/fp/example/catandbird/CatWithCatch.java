package com.example.design.fp.example.catandbird;

import java.util.function.BiFunction;
import java.util.function.Function;

public class CatWithCatch {

    private final Bird capturedBird;

    public CatWithCatch(Bird bird) {
        this.capturedBird = bird;
    }

    public FullCat eat() {
        return new FullCat();
    }

    public static void main(String[] args) {
        BiFunction<Cat, Bird, FullCat> catchFunction = (cat, bird) -> cat.capture(bird).eat();
        BiFunction<Cat, Bird, FullCat> catchFunction2 = ((BiFunction<Cat, Bird, CatWithCatch>) Cat::capture).andThen(CatWithCatch::eat);
        FullCat fullCat1 = catchFunction.apply(new Cat(), new Bird());
        FullCat fullCat2 = catchFunction2.apply(new Cat(), new Bird());

        BiFunction<Cat, Bird, CatWithCatch> capture = Cat::capture;
        Function<CatWithCatch, FullCat> eat = CatWithCatch::eat;
        BiFunction<Cat, Bird, FullCat> catchFunction3 = capture.andThen(eat);
        FullCat fullCat3 = catchFunction3.apply(new Cat(), new Bird());
    }

}
