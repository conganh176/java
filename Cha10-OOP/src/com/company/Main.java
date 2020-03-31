package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 4.20, "Black");
        hamburger.addHamburgerAddition("Tomato", 0.6);
        hamburger.addHamburgerAddition2("Lettuce", 0.69);
        hamburger.addHamburgerAddition3("Cheese", 0.42);
        System.out.println("Total: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 6.96);
        healthyBurger.addHamburgerAddition("Egg", 4.20);
        healthyBurger.addHealthyAddition("Something nice", 6.20);
        System.out.println("Total " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition("Real gold", 42069);
        System.out.println("Total: " + deluxeBurger.itemizeHamburger());
    }
}
