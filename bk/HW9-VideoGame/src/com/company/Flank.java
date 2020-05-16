package com.company;

import java.util.ArrayList;

public class Flank extends Line {
    private boolean isLeft;
    private TroopInFlank[][] all;
    public final int MAX_TROOP_IN_FLANK = 60;
    private int x, y;

    public Flank(int capacity, int slot, boolean isLeft, int x, int y) {
        super(capacity, slot);
        this.isLeft = isLeft;
        this.all = new TroopInFlank[x][y];
        this.x = x;
        this.y = y;
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

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (all[j][i] != null) {
                    if(all[j][i] instanceof Sword)
                        sword.add((Sword) all[j][i]) ;
                    else
                        spear.add((Spear) all[j][i]);
                }
            }
        }

        all = new TroopInFlank[x][y];
        int countSword = 0;
        int countSpear = 0;
        int slotsForSword = sword.size();
        int slotsForSpear = spear.size();

        for (int i = 0; i < y; i++) {
            if (i < slotsForSword) {
                for (int j = 0; j < x; j++) {
                    if (countSword < sword.size()) {
                        all[j][i] = sword.get(countSword);
                        countSword++;
                    }
                }
            }
        }

        for (int i = slotsForSword; i < y; i++) {
            if (i < slotsForSpear + slotsForSword) {
                for (int j = 0; i < 20; j++) {
                    if (countSpear < spear.size()) {
                        all[j][i] = spear.get(countSpear);
                        countSpear++;
                    }
                }
            }
        }
        
    }
}
