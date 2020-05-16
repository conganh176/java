package com.company;

import java.util.ArrayList;

public class Host {
    private int id;
    private ArrayList<Packet> queue;
    private Packet[] eXB;

    public Host(int id) {
        this.id = id;
        this.queue = new ArrayList<>();
        this.eXB = new Packet[5];
    }

    public Packet removeQueue(){
        Packet packet = queue.get(0);
        queue.remove(0);
        return packet;
    }

    public int position(Packet[] eXB) {
        int index = 0;
        for (int i = 0; i <eXB.length ; i++) {      //find the null then stop
            if (eXB[i] != null) {
                index++;
            }
            else {
                break;
            }
        }

        if (index == eXB.length) {      //when no null index
            return -1;
        }

        return index;
    }
}
