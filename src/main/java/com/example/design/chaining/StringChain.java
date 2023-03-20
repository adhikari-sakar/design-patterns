package com.example.design.chaining;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class StringChain {

    public static void main(String[] args) {
        UnaryOperator<String> replace = s -> s.replace("c", "j");
        UnaryOperator<String> trim = String::trim;

        Function<String, String> format = replace.andThen(trim);
        System.out.println(format.apply(" cava "));
    }


}
