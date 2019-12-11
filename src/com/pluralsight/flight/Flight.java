package com.pluralsight.flight;

public class Flight {
    private int seats;
    private int passengers;

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void add1Passenger() {
        if (passengers < seats) {
            passengers++;
        } else {
            handleTooMany();
        }
    }

    private void handleTooMany() {
        System.out.println("Too many passengers!");
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
