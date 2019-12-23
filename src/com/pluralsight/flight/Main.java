package com.pluralsight.flight;

import java.io.*;

public class Main {

    public static void main(String[] args) {
    	BufferedReader reader = null;
    	int total = 0;

    	try {
			reader = new BufferedReader(new FileReader("numbers.txt"));

			String line;

			while((line = reader.readLine()) != null) {
				total += Integer.parseInt(line);
			}

			System.out.println("Total " + total);
    	} catch (NumberFormatException e) {
			System.out.println("NumberFormatException occurs! Error: " + e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("File not found! Error: " + e.getMessage());
    	} catch (IOException e) {
			System.out.println("Some random IO exception! Error: " + e.getMessage());
		} finally {
    		try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
    			System.out.println("Buffered reader errored when close!");
    			System.out.println(e.getMessage());
			}
    	}

		int i = 12;
		int j = 2;

		try {
			int k = i / (j - 2);
			System.out.println(k);
		} catch (Exception e) {
			System.out.println("Error! " + e.getMessage());
			e.printStackTrace();
		}

		Flight f1 = new Flight('s');
		System.out.println("My flight is " + f1.toString());
	}
}
