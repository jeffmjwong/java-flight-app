package com.pluralsight.flight;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		Flight f1 = new Flight('s');
		System.out.println("My flight is " + f1.toString());

		Passenger bob = new Passenger();
		bob.setLevelAndDays(1, 180, "bob");
		Passenger jane = new Passenger();
		jane.setLevelAndDays(1, 90, "jane");
		Passenger steve = new Passenger();
		steve.setLevelAndDays(2, 180, "steve");
		Passenger lisa = new Passenger();
		lisa.setLevelAndDays(3, 730, "lisa");

		Passenger[] passengers = { bob, jane, steve, lisa };
		System.out.println(passengers[0].name);
		System.out.println(passengers[1].name);
		System.out.println(passengers[2].name);
		System.out.println(passengers[3].name);
		Arrays.sort(passengers);
		System.out.println(passengers[0].name);
		System.out.println(passengers[1].name);
		System.out.println(passengers[2].name);
		System.out.println(passengers[3].name);
	}
}
