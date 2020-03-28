package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(420, 69, 666);
	    Case theCase = new Case("420", "Apple", "69", dimensions);

        Monitor monitor = new Monitor("32 inch Apple Display", "Apple", 32, new Resolution(1920, 1080));

        Motherboard motherboard = new Motherboard("42069", "Apple", 8, 4, "v4.20");

        Computer computer = new Computer(theCase, motherboard, monitor);
        computer.powerUp();

    }
}
