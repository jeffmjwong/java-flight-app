package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
    	Flight f1 = new Flight(175);
    	Flight f2 = new Flight(175);

    	System.out.println(f1 == f2);
    	System.out.println(f1.equals(f2));

    	Passenger p1 = new Passenger();
    	System.out.println(f1.equals(p1));
    }
}
