package com.example.design.oo.example.salarycalculator;

public class SalaryCalculator {

    double plusAllowance(double d) {
        return d * 1.2;
    }

    double plusBonus(double d) {
        return d * 2.0;
    }

    double plusTax(double d) {
        return d * 3.6;
    }

    double plusSurcharge(double d) {
        return d * 1.9;
    }

    double calculate(double baseSalary, boolean isAllowance, boolean isBonus, boolean isTax, boolean isSurcharge) {
        if (isAllowance)
            baseSalary += plusAllowance(baseSalary);
        if (isBonus)
            baseSalary += plusBonus(baseSalary);
        if (isTax)
            baseSalary += plusTax(baseSalary);
        if (isSurcharge)
            baseSalary += plusSurcharge(baseSalary);
        return baseSalary;
    }
}
