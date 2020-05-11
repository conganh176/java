package com.company;

public class Powder extends Unit {
    private int munition;

    public Powder(int damage, int blood, int armor, int munition) {
        super(damage, blood, armor);
        this.munition = munition;
    }

    public int getMunition() {
        return munition;
    }

    public void setMunition(int munition) {
        this.munition = munition;
    }
}
