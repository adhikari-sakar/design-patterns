package com.example.design.fp.example.salarycalculator;

public class SalaryRules {

    public static double allowance(double d) {
        return d * 1.2;
    }

    public static double bonus(double d) {
        return d * 2.0;
    }

    public static double tax(double d) {
        return d * 3.6;
    }

    public static double surcharge(double d) {
        return d * 1.9;
    }
}
