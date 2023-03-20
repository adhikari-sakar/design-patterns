package com.example.design.patterns.structural.adapter;

public class EmployeeLDAP {
    private String cn;
    private String givenName;
    private String surname;
    private String mail;

    public EmployeeLDAP(String cn, String givenName, String surname, String mail) {
        this.cn = cn;
        this.givenName = givenName;
        this.surname = surname;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "EmployeeLDAP{" +
                "cn='" + cn + '\'' +
                ", givenName='" + givenName + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
