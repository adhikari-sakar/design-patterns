package com.example.design.patterns.structural.adapter;

public class EmployeeLdapAdapter implements Employee {
    private final EmployeeLDAP employeeLDAP;

    public EmployeeLdapAdapter(EmployeeLDAP employeeLDAP) {
        this.employeeLDAP = employeeLDAP;
    }

    @Override
    public String getId() {
        return employeeLDAP.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLDAP.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLDAP.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLDAP.getMail();
    }
}
