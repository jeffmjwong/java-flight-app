package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
    	Flight f1 = new Flight(175);
    	String location = "Florida";
    	StringBuilder sb = new StringBuilder(40);

    	sb.append("I flew to ");
    	sb.append(location);
    	sb.append(" on ");
    	sb.append(f1.toString());

    	int time = 9;
    	int pos = sb.length() - " on ".length() - f1.toString().length();

    	sb.insert(pos, " at ");
    	sb.insert(pos + 4, time);

    	String message = sb.toString();
    	System.out.println(message);
    }
}
