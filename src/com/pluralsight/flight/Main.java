package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
    	Flight f1 = new Flight();
    	Flight f2 = new Flight();
    	Flight f3 = f2;

    	System.out.println(f2 == f3);
    }
}
