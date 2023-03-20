package com.example.design.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        EmployeeDB employeeDB = new EmployeeDB("1", "Sakar", "Adhikari", "sakar.adhikari@cusus.com");
        employees.add(employeeDB);

        // Adapting existing Ldap employee to new Employee Interface
        EmployeeLDAP employeeLDAP = new EmployeeLDAP("2", "John", "Cena", "john.cena@cusus.com");
        employees.add(new EmployeeLdapAdapter(employeeLDAP));

        EmployeeCsv employeeCsv = new EmployeeCsv("3,testF,testL,test@emil.com");
        employees.add(new EmployeeCsvAdapter(employeeCsv));

        System.out.println(employees);

        return employees;
    }
}
