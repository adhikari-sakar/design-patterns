package com.example.design.patterns.structural.adapter;

import java.util.StringTokenizer;

public class EmployeeCsv {

    private int id;
    private String firstName;
    private String lastName;
    private String mail;

    public EmployeeCsv(String employeeData) {
        StringTokenizer tokenizer = new StringTokenizer(employeeData, ",");
        if (tokenizer.hasMoreElements()) {
            this.id = Integer.parseInt(tokenizer.nextToken());
        }

        if (tokenizer.hasMoreElements()) {
            this.firstName = tokenizer.nextToken();
        }

        if (tokenizer.hasMoreElements()) {
            this.lastName = tokenizer.nextToken();
        }

        if (tokenizer.hasMoreElements()) {
            this.mail = tokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "EmployeeCsv{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
