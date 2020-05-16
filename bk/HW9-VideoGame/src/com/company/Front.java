package com.company;

public class Front extends Line{
    private NonMunition[][] all;
    public final int MAX_NON_MUNITION = 240;

    public Front(int capacity, int slot, int x, int y) {
        super(capacity, slot);
        this.all = new NonMunition[x][y];
    }
}
