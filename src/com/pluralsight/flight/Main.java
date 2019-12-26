package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
    	Passenger steve = new Passenger();
    	steve.getRewardProgram().setMemberLevel(3);
    	steve.getRewardProgram().setMemberDays(180);
    	System.out.println(steve.getRewardProgram().getMemberLevel());
    	System.out.println(steve.getRewardProgram().getMemberDays());

    	Passenger.RewardProgram platinum = new Passenger.RewardProgram();
    	System.out.println(platinum.getMemberLevel());
	}
}
