package com.example.design.fp.example.salarycalculator;

public class SalaryApp {

    public static void main(String[] args) {
        Double totalSalary = new SalaryCalculator()
                .with(SalaryRules::allowance)
                .with(SalaryRules::bonus)
                .with(SalaryRules::tax)
                .with(d -> d * 1.05)
                .calculate(1000.0);

        Double totSalary = new BetterSalaryCalculator()
                .with(SalaryRules::allowance)
                .with(SalaryRules::bonus)
                .with(d -> d * 1.05)
                .with(SalaryRules::tax)
                .calculate(1000.0);
    }
}
