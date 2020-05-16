package com.company;

public abstract class Unit {
    private int damage;
    private int blood;
    private int armor;

    public Unit(int damage, int blood, int armor) {
        this.damage = damage;
        this.blood = blood;
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
