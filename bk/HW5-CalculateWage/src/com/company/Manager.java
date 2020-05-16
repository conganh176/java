package com.company;

public class Manager extends Official {
    private final int MAX_WORKER = 14;
    private final int MIN_OFFICIAL = 2;
    private final int MAX_OFFICIAL = 7;

    private Worker[] workers;
    private Sale[] sales;
    private Staff[] staffs;

    public Manager(String name, int age, int years, String id) {
        super(name, age, years, id);
        this.workers = new Worker[14];
        this.sales = new Sale[7];
        this.staffs= new Staff[7];
    }
}
