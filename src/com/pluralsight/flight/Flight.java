package com.pluralsight.flight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Flight implements Comparable<Flight>, Iterable<Person> {
    static final int MAX_FAA_SEATS = 550;
    private int seats = 150;
    private int passengers;
    private int totalCheckedBags;
    private int maxCarryOns = seats * 2;
    private int totalCarryOns;
    private Integer flightNumber;
    private Character flightClass;
    private boolean[] isSeatAvailable;
    private int flightTime; // minutes past midnight
    private CrewMember[] crew;
    private Passenger[] roster;

    static int allPassengers;

    static int getAllPassengers() {
        return allPassengers;
    }

    static void resetAllPassengers() {
        allPassengers = 0;
    }

    public void setCrew(CrewMember[] crew) {
        this.crew = crew;
    }

    public void setRoster(Passenger[] roster) {
        this.roster = roster;
    }

    public int getSeats() {
        return this.seats;
    }
    public void setSeats(int seats) {
        if (seats <= MAX_FAA_SEATS) {
            this.seats = seats;
        }
    }

    public int getPassengers() { return this.passengers; }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getTotalCheckedBags() { return this.totalCheckedBags; }
    public int getMaxCarryOns() { return this.maxCarryOns; }
    public int getTotalCarryOns() { return this.totalCarryOns; }

    public int getFlightNumber() { return this.flightNumber; }
    public char getFlightClass() { return this.flightClass; }

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
        if (this.hasSeating()) {
            this.passengers++;
            allPassengers++;
        } else {
            handleTooMany();
        }
    }

    public void add1Passenger(int bags) {
        if (this.hasSeating()) {
            this.add1Passenger();
            this.totalCheckedBags += bags;
        }
    }

    public void add1Passenger(int bags, int carryOns) {
        if (this.hasSeating() && this.hasCarryOnSpace(carryOns)) {
            this.add1Passenger(bags);
            this.totalCarryOns += carryOns;
        }
    }

    public void add1Passenger(Passenger p) {
        this.add1Passenger(p.getCheckedBags());
    }

    public void add1Passenger(Passenger p, int carryOns) {
        this.add1Passenger(p.getCheckedBags(), carryOns);
    }

    public void addPassengers(Passenger... list) {
        if (hasSeating(list.length)) {
            this.passengers += list.length;
            for (Passenger p : list) {
                this.totalCheckedBags += p.getCheckedBags();
            }
        } else {
            this.handleTooMany();
        }
    }

    public void addPassengers(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                this.passengers += Integer.parseInt(parts[0]);
            }
        }
    }

    private void handleTooMany() {
        System.out.println("Too many passengers!");
    }

    private boolean hasSeating() {
        return this.passengers < this.seats;
    }

    private boolean hasSeating(int count) {
        return this.passengers + count <= this.seats;
    }

    private boolean hasCarryOnSpace(int carryOns) {
        return this.totalCarryOns + carryOns <= this.maxCarryOns;
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

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }

        if (!(obj instanceof Flight)) {
            return false;
        }

        Flight otherFlight = (Flight)obj;

        return this.getFlightNumber() == otherFlight.getFlightNumber() &&
                this.getFlightClass() == otherFlight.getFlightClass();
    }

    @Override
    public String toString() {
        if (this.flightNumber != null) {
            return "Flight #" + this.flightNumber;
        } else if (this.flightClass != null) {
            return "Flight Class " + this.flightClass;
        } else {
            return "Unknown flight!";
        }
    }

    public int compareTo(Flight f) {
        return this.flightTime - f.flightTime;
    }

    public Iterator<Person> iterator() {
        return new Iterator<Person>() {
            private int index = 0;

            public boolean hasNext() {
                return index < (crew.length + roster.length);
            }

            public Person next() {
                Person p = (index < crew.length) ? crew[index] : roster[index - crew.length];
                this.index++;

                return p;
            }
        };
    }
}
