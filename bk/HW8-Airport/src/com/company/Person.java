package com.company;

public class Person {
    private String name;
    private int idNumber;

    public Person(int idNumber, String name) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
