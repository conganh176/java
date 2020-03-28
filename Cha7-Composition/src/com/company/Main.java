package com.company;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(420, 69);
        Bed bed = new Bed("Classic", 4, 4, 2, 1);
        Lamp lamp = new Lamp("Classic", true, 75);

        Bedroom bedroom = new Bedroom("My bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
