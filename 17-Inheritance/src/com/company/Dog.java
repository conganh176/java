package com.company;

public class Dog extends Animal
{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int tails, int legs, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tails;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew()
    {
        System.out.println("chew");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void run()
    {
        System.out.println("run");
        super.move(420);        //call from Animal
    }

    public void walk()
    {
        System.out.println("walk");
        move(69);               //call from Dog
    }

    public void moveLegs(int speed)
    {
        System.out.println("move leg");
    }

    @Override
    public void move(int speed) {
        moveLegs(speed);
        super.move(speed);
    }
}
