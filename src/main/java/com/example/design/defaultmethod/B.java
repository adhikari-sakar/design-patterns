package com.example.design.defaultmethod;

public interface B {
    default void hello(){
        System.out.println("Hello from B");
    }

    default Number getNumber(){
        return 10;
    }
}
