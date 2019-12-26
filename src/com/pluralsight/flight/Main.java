package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
    	Passenger steve = new Passenger("steve");
    	steve.getRewardProgram().setMemberLevel(3);
    	steve.getRewardProgram().setMemberDays(180);
    	System.out.println(steve.getRewardProgram().getMemberLevel());
    	System.out.println(steve.getRewardProgram().getMemberDays());

    	Passenger.RewardProgram platinum = new Passenger.RewardProgram();
    	platinum.setMemberLevel(3);

    	if (steve.getRewardProgram().getMemberLevel() == platinum.getMemberLevel()) {
    		System.out.println("Steve is platinum member!");
		}

    	Flight lax045 = new Flight(45);
    	lax045.setRoster(new Passenger[] { steve });
    	lax045.setCrew(new CrewMember[] {});

    	for (Person p : lax045) {
    		System.out.println(p.getName());
		}
	}
}
