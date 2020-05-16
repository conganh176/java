package com.company;

public class Company {
    private final int MAX_LEADER = 20;
    private Leader[] leaders;
    private int totalLeader;

    public Company() {
        this.leaders = new Leader[MAX_LEADER];
    }
}
