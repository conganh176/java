package com.company;

import java.util.ArrayList;

public class Flight {
    private int id;
    public final int MAX_PERSON = 100;
    public ArrayList<Person> passenger;

    public Flight(int id) {
        this.id = id;
        passenger = new ArrayList<Person>();
    }

    public int getId() {
        return id;
    }

    public void addPassenger(Person person) {
        System.out.println("Total passenger: " + availableSeats());
        if (availableSeats() < MAX_PERSON) {
            passenger.add(person);
            System.out.println("Add " + person.getName() + " to flight " + this.id);
            System.out.println("Total after added: " + availableSeats());
        }
        else {
            System.out.println("The flight is out of available seat");
        }
    }

    public int availableSeats() {
        return passenger.size();
    }

    public int numberOfVIP() {
        int numOfVIP = 0;
        for (int i = 0; i < availableSeats(); i++) {
            if (passenger.get(i) instanceof VIP)
                numOfVIP++;
        }

        return numOfVIP;
    }
}
