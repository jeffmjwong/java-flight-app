package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
	    Flight flight1 = new Flight();
	    Flight flight2 = new Flight();

        flight1.add1Passenger();
        flight1.add1Passenger();
        flight1.add1Passenger();
        flight2.add1Passenger();
        flight2.add1Passenger();

	    System.out.println(flight1.hasRoom(flight2));

	    Passenger p1 = new Passenger(3);
	    System.out.println(p1.getFreeBags());
	    Passenger p2 = new Passenger();
	    System.out.println(p2.getFreeBags());
    }
}
