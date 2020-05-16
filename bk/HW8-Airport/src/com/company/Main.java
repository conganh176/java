package com.company;

public class Main {

    public static void main(String[] args) {
        Airplane boing747 = new Airplane(20);

        Flight flight0 = new Flight(123);

        flight0.addPassenger(new Customer(01, "John Smith"));
        flight0.addPassenger(new Customer(02, "Not John Smith"));
        flight0.addPassenger(new Customer(03, "The John Smith"));
        flight0.addPassenger(new VIP(04, "VIP John Smith", "VIP card"));
        flight0.addPassenger(new Customer(05, "Oh Hi John Smith"));
        flight0.addPassenger(new VIP(06, "Also VIP John Smith", "VIP card"));

        System.out.println("The plane is enable to fly: " + boing747.isEnableToFly(flight0));
        System.out.println("Total passengers: " + flight0.availableSeats());
        System.out.println("Total VIPs: " + flight0.numberOfVIP());
    }
}
