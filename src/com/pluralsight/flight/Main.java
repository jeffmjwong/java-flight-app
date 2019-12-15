package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
	    Flight f1 = new Flight();
	    Passenger p1 = new Passenger(0, 1);
	    Passenger p2 = new Passenger(0, 2);

		f1.addPassengers(p1, p2);

		System.out.println(f1.getPassengers());
		System.out.println(f1.getMaxCarryOns());
		System.out.println(f1.getTotalCarryOns());
		System.out.println(f1.getTotalCheckedBags());

		CargoFlight cf1 = new CargoFlight();
		cf1.add1Package(5.0f, 3.5f, 8.5f);
		System.out.println(cf1.getUsedCargoSpace());
    }
}
