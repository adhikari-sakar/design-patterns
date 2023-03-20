package com.example.design.defaultmethod;

public class C implements A, B {
    // must override the default method to avoid diamond problem
    @Override
    public void hello() {
        System.out.println("Hello from C");
        B.super.hello();
        A.super.hello();
    }

    @Override
    public Integer getNumber() {
        return (Integer) B.super.getNumber();
    }

    public static void main(String[] args) {
        new C().hello();
        System.out.println(new C().getNumber());
    }
}
