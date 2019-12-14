package com.pluralsight.flight;

public class Flight {
    private int seats = 150;
    private int passengers;
    private int flightNumber;
    private char flightClass;
    private boolean[] isSeatAvailable;

    public int getSeats() {
        return this.seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getPassengers() { return this.passengers; }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean[] getIsSeatAvailable() { return this.isSeatAvailable; }

    {
        this.isSeatAvailable = new boolean[seats];

        for (int i = 0; i < seats; i++) {
            this.isSeatAvailable[i] = true;
        }
    }

    public Flight() {}

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }

    public void add1Passenger() {
        if (hasSeating()) {
            passengers++;
        } else {
            handleTooMany();
        }
    }

    private void handleTooMany() {
        System.out.println("Too many passengers!");
    }

    private boolean hasSeating() {
        return this.passengers < this.seats;
    }

    public boolean hasRoom(Flight f2) {
        int total = this.passengers + f2.passengers;
        return total < seats;
    }

    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;

        return newFlight;
    }
}
