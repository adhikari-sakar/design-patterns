package com.example.design.oo.example.salarycalculator;

public class SalaryBuilder {

    private boolean isAllowance;
    private boolean isBonus;
    private boolean isTax;
    private boolean isSurcharge;

    private SalaryBuilder(){

    }

    public SalaryBuilder withAllowance() {
        this.isAllowance = true;
        return this;
    }

    public SalaryBuilder withBonus() {
        this.isBonus = true;
        return this;
    }

    public SalaryBuilder withTax() {
        this.isTax = true;
        return this;
    }

    public SalaryBuilder withSurcharge() {
        this.isSurcharge = true;
        return this;
    }

    public double calculateSalary(double baseSalary) {
        return new SalaryCalculator().calculate(baseSalary, isAllowance, isBonus, isTax, isSurcharge);
    }

    public static SalaryBuilder builder(){
        return new SalaryBuilder();
    }

}
