package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Bull", 20, 20, 2, 1, 4, 20, "Long");

        dog.walk();
        dog.run();
    }
}
