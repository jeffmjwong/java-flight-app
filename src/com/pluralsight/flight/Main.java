package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
    	Passenger steve = new Passenger();
    	steve.getRewardProgram().setMemberLevel(3);
    	System.out.println(steve.getRewardProgram().getMemberLevel());
	}
}
