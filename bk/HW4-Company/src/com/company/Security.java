package com.company;

public class Security extends Person {
    private int year;
    private String birth;

    public Security(String name, int age, String pid, String tax, boolean isMale, String ins, int year, String birth) {
        super(name, age, pid, tax, isMale, ins);
        this.year = year;
        this.birth = birth;
    }
}
