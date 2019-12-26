package com.pluralsight.flight;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		Flight f1 = new Flight('s');
		System.out.println("My flight is " + f1.toString());

		Passenger bob = new Passenger();
		bob.setLevelAndDays(1, 180);
		Passenger jane = new Passenger();
		jane.setLevelAndDays(1, 90);
		Passenger steve = new Passenger();
		steve.setLevelAndDays(2, 180);
		Passenger lisa = new Passenger();
		lisa.setLevelAndDays(3, 730);

		Passenger[] passengers = { bob, jane, steve, lisa };
		Arrays.sort(passengers);
	}
}
