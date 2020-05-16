package com.company;

public class Leader extends Person {
    private final int MAX_SECURITY = 12;
    private int year;
    private String birth;
    private Security[] securities;
    private int totalSecurites = 0;

    public Leader(String name, int age, String pid, String tax, boolean isMale, String ins, int year, String birth) {
        super(name, age, pid, tax, isMale, ins);
        this.year = year;
        this.birth = birth;
        this.securities = new Security[MAX_SECURITY];
    }

    public void addSecurity(Security security) {
        if (totalSecurites < MAX_SECURITY) {
            securities[totalSecurites] = security;
            totalSecurites++;
            System.out.println("Security " + security.getName() + " added to Leader " + this.getName());
        }
        else {
            System.out.println("The number of securities for " + security.getName() + " is full");
        }
    }
}
