package com.example.design.patterns.structural.adapter;

public class EmployeeCsvAdapter implements Employee {

    private final EmployeeCsv employeeCsv;

    public EmployeeCsvAdapter(EmployeeCsv employeeCsv) {
        this.employeeCsv = employeeCsv;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeCsv.getId());
    }

    @Override
    public String getFirstName() {
        return employeeCsv.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeCsv.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeCsv.getMail();
    }
}
