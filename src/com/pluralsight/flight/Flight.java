package com.pluralsight.flight;

public class Flight {
    int seats;
    int passengers;

    Flight() {
        seats = 150;
        passengers = 0;
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
}
