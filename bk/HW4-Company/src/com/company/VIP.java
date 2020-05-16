package com.company;

public class VIP extends Person {
    private int shift;
    private final int MIN_BODYGUARD = 1;
    private final int MAX_BODYGUARD = 6;
    private int totalBodyguards;
    private Bodyguard[] bodyguards;

    public VIP(String name, int age, String pid, String tax, boolean isMale, String ins, int shift) {
        super(name, age, pid, tax, isMale, ins);
        this.shift = shift;
        this.bodyguards = new Bodyguard[MAX_BODYGUARD];
    }
}
