package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
    	Flight f1 = new Flight(175);
    	Flight f2 = new Flight('Z');
    	CargoFlight cf1 = new CargoFlight(200);

    	System.out.println("My flight is " + f1);
    	System.out.println("My flight is " + f2);
    }
}
