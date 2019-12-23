package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
		Flight f1 = new Flight('s');
		System.out.println("My flight is " + f1.toString());

		int i = 12;
		int j = 2;

		try {
			int k = i / (j - 2);
			System.out.println(k);
		} catch (Exception e) {
			System.out.println("Error! " + e.getMessage());
		}
	}
}
