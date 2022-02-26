package com.lockers.lockedme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String output = null;
		
		System.out.println("Welcome to LockedMe! Created by: David Huang\n");
		
		while(output == null || !output.equals("1") && !output.equals("2") && !output.equals("3")) {
			if (output != null) {
				System.out.println("Invalid input. Please enter a valid input.");
			}
			System.out.println("1. Print current file names in ascending order\n"
				+ "2. Display user options\n"
				+ "3. Exit application\n\n"
				+ "Enter your input:");
			output = scanner.nextLine();
		}
		
		
		scanner.close();
	}

}
