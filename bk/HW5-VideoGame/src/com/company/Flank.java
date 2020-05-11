package com.company;

import java.util.ArrayList;

public class Flank extends Line {
    private boolean isLeft;
    private TroopInFlank[][] all;

    public Flank(int capacity, int slot, boolean isLeft) {
        super(capacity, slot);
        this.isLeft = isLeft;
        this.all = new TroopInFlank[3][5];
    }

    public boolean isLeft() {
        return isLeft;
    }

    public TroopInFlank[][] getAll() {
        return all;
    }

    public void arrange(TroopInFlank[] group) {
        ArrayList<Sword> sword = new ArrayList<Sword>();
        ArrayList<Spear> spear = new ArrayList<Spear>();

        for (TroopInFlank troop : group) {
            if (troop instanceof Sword)
                sword.add((Sword) troop);
            else
                spear.add((Spear) troop);
        }
    }
}
