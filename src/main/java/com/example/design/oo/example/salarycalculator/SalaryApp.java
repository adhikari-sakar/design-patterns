package com.example.design.oo.example.salarycalculator;

public class SalaryApp {

    public static void main(String[] args) {
        double totalSalary = SalaryBuilder.builder()
                .withAllowance()
                .withTax()
                .withBonus()
                .withSurcharge()
                .calculateSalary(1000.0);
    }
}
