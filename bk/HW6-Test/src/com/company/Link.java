package com.company;

public class Link {
    public Host host;
    public Switch[] sws;
    public int[] from;
    public int[] to;
    public Packet[] pkt;

    public Link(Host host) {
        this.host = host;
        this.sws = new Switch[2];
        this.from = new int[2];
        this.to = new int[2];
        this.pkt = new Packet[2];
    }

    public Packet[] getENB(int id) {

    }
}
