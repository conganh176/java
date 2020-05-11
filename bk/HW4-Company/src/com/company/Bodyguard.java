package com.company;

public class Bodyguard extends Security {
    private int level;

    public Bodyguard(String name, int age, String pid, String tax, boolean isMale, String ins, int year, String birth, int level) {
        super(name, age, pid, tax, isMale, ins, year, birth);
        this.level = level;
    }
}
