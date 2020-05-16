package com.company;

public class LongRange extends Line {
    private Powder[][] all;
    public final int MAX_POWDER = 96;

    public LongRange(int capacity, int slot, int x, int y) {
        super(capacity, slot);
        this.all = new Powder[x][y];
    }
}
