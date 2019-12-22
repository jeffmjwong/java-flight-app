package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
		Flight f1 = new Flight('s');
		System.out.println("My flight is " + f1.toString());

		Integer i1000A = 10 * 10 * 10;
		Integer i1000B = 100 * 10;
		System.out.println(i1000A == i1000B);
		System.out.println(i1000A.equals(i1000B));

		int a = 10 * 10 * 10;
		int b = 100 * 10;
		System.out.println(a == b);

		Integer i8A = 4 * 2;
		Integer i8B = 2 * 2 * 2;
		System.out.println(i8A == i8B);
	}
}
