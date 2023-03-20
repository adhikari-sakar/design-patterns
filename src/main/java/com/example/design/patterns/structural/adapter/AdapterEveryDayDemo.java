package com.example.design.patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEveryDayDemo {

    public static void main(String[] args) {
        Integer [] integers = new Integer[] {1,3,5,7,9};
        List<Integer> integerList = Arrays.asList(integers);
        System.out.println(integers);
        System.out.println(integerList);
    }
}
