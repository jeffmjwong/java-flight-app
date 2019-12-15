package com.pluralsight.flight;

public abstract class Pilot {
    private Flight currentFlight;

    public void fly(Flight flight) {
        if (canAccept(flight)) {
            this.currentFlight = flight;
        } else {
            this.handleCantAccept();
        }
    }

    public abstract boolean canAccept(Flight flight);

    private void handleCantAccept() {
        System.out.println("Can't accept the flight!!");
    }
}
