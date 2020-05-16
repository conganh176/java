package com.company;

public class Switch {
    private int id;
    private Packet[][] eNB;
    private Packet[][] eXB;

    public Switch(int id) {
        this.id = id;
        this.eNB = new Packet[4][5];
        this.eXB = new Packet[4][5];
    }

    public int position(Packet[] eXB) {
        int index = 0;
        for (int i = 0; i < eXB.length ; i++) {
            if(eXB[i] != null){
                index ++;
            }
            else {
                break;
            }
        }

        if (index == eXB.length){
            return -1;
        }

        return index;
    }
}
