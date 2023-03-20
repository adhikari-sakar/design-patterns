package com.example.design.patterns.structural.flyweight;

public class FlyWeightEverydayDemo {

    public static void main(String[] args) {

        Integer firstInt = Integer.valueOf(5);
        Integer secondInt = Integer.valueOf(5);
        Integer thirdInt = Integer.valueOf(10);

        // first and second ints are cached to optimize memory to return same identity
        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
    }

}
