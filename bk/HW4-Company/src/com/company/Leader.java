package com.company;

public class Leader extends Person {
    private final int MAX_SECURITY = 12;
    private int year;
    private String birth;


    public Leader(String name, int age, String pid, String tax, boolean isMale, String ins, int year, String birth) {
        super(name, age, pid, tax, isMale, ins);
        this.year = year;
        this.birth = birth;
    }
}
