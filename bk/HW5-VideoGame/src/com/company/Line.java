package com.company;

public abstract class Line {
    private int capacity;
    private int slot;

    public Line(int capacity, int slot) {
        this.capacity = capacity;
        this.slot = slot;
    }
}
