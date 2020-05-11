package com.company;

public class Worker extends Employee {
    private int level;

    public Worker(String name, int age, int years, String id, int level)
    {
        super(name, age, years, id);
        this.level = level;
    }


}
