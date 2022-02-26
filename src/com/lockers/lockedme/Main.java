package com.lockers.lockedme;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String output = null;
		ArrayList<String> directoryList = new ArrayList<String>();
		
		System.out.println("Welcome to LockedMe! Created by: David Huang\n");
		
		while(true) {
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
			
			if (output.equals("3")) {
				// exit application
				System.out.println("Exiting application. Have a good day.");
				break;
				
			} else if (output.equals("2")) {
				// display user options
				System.out.println("1. Add file to the existing directory list\n"
						+ "2. Delete a file from the existing directory list"
						+ "3. Search a file from the main directory"
						+ "4. Go back to welcome screen");
				
			} else if (output.equals("1")) {
				// print current file names in ascending order
				
				break;
			}
		}
		
		scanner.close();
	}

}
