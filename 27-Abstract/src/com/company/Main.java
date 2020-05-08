package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Pug");
        dog.breath();
        dog.eat();

        System.out.println();

        Bird parrot = new Parrot("Sumbird");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        System.out.println();

        Penguin penguin = new Penguin("Sumpenguin");
        penguin.breath();
        penguin.eat();
        penguin.fly();
    }
}
