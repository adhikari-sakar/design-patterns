package com.example.design.defaultmethod;

public interface A {
    default void hello(){
        System.out.println("Hello from A");
    }

    default Integer getNumber(){
        return 100;
    }
}
