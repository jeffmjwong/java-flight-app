package com.pluralsight.flight;

import static com.pluralsight.flight.Flight.resetAllPassengers;
import static com.pluralsight.flight.Flight.getAllPassengers;

public class Main {

    public static void main(String[] args) {
    	Flight lax045 = new Flight(45);
    	CrewMember pilot = new CrewMember("pilot");
    	CrewMember copilot = new CrewMember("copilot");
    	CrewMember marshal = new CrewMember("marshal");
    	Passenger bob = new Passenger("bob");
    	Passenger jane = new Passenger("jane");
    	Passenger steve = new Passenger("steve");
    	Passenger lisa = new Passenger("lisa");

    	CrewMember[] crewMembers = { pilot, copilot, marshal };
    	Passenger[] rosterMembers = { bob, jane, steve, lisa };

    	lax045.setCrew(crewMembers);
    	lax045.setRoster(rosterMembers);

    	for (Person p : lax045) {
    		System.out.println(p.getName());
		}

		lax045.add1Passenger();
		lax045.add1Passenger();
		lax045.add1Passenger();
		Flight b = new Flight(90);
		b.add1Passenger();
		b.add1Passenger();
    	System.out.println(getAllPassengers());
    	resetAllPassengers();
		System.out.println(getAllPassengers());
	}
}
