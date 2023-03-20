package com.example.design.fp.example.salarycalculator;

import java.util.function.Function;

public class BetterSalaryCalculator {

    private final Function<Double, Double> calc;

    public BetterSalaryCalculator() {
        this(Function.identity());
    }

    public BetterSalaryCalculator(Function<Double, Double> calc) {
        this.calc = calc;
    }

    public BetterSalaryCalculator with(Function<Double, Double> f) {
        return new BetterSalaryCalculator(calc.andThen(f));
    }

    public Double calculate(Double baseSalary) {
        return calc.apply(baseSalary);
    }
}
