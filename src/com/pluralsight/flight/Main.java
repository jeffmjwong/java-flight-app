package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
	    Flight flight1 = new Flight();

        flight1.add1Passenger();
        flight1.add1Passenger();
        flight1.add1Passenger();

	    System.out.println(flight1.passengers);
        System.out.println(flight1.seats);
    }
}
