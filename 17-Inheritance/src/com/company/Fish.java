package com.company;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest()
    {

    }

    public void moveMuscle()
    {
        System.out.println("move muscle");
    }

    public void moveFin()
    {
        System.out.println("move fin");
    }

    public void swim(int speed)
    {
        moveMuscle();
        moveFin();
        super.move(speed);
    }
}
