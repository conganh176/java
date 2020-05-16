package com.company;

import java.util.ArrayList;

public class Airplane {
    private int numberOfSeats;
    public final int MAX_FLIGHT = 50;
    public ArrayList<Flight> flight;

    public Airplane(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        flight = new ArrayList<Flight>();
    }

    public void addFlight(Flight flight) {
        if (this.flight.size() < MAX_FLIGHT) {
            this.flight.add(flight);
            System.out.println("Add Flight " + flight.getId());
            System.out.println("Total flights: " + this.flight.size());
        }
        else {
            System.out.println("Out of available flight");
        }
    }

    public boolean isEnableToFly(Flight f) {
        if (f.availableSeats() <= (numberOfSeats * 80 / 100)) {
            return true;
        }
        else return false;
    }
}
