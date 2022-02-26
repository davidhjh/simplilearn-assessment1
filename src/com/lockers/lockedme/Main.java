package com.lockers.lockedme;

import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String input = null;
		ArrayList<String> directoryList = new ArrayList<String>();
		
		System.out.println("Welcome to LockedMe! Created by: David Huang\n");
		
		while(true) {
			while(input == null || !input.equals("1") && !input.equals("2") && !input.equals("3")) {
				if (input != null) {
					// built in input error check
					System.out.println("Invalid input. Please enter a valid input.");
				}
				System.out.println("1. Print current file names in ascending order\n"
						+ "2. Display user options\n"
						+ "3. Exit application\n\n"
						+ "Enter your input:");
				input = scanner.nextLine();
				System.out.println();
			}
			
			if (input.equals("3")) {
				// exit application
				System.out.println("Exiting application. Have a good day.");
				break;
				
			} else if (input.equals("2")) {
				// give user their options using helper function
				userActions(directoryList);
				
			} else if (input.equals("1")) {
				// print current file names in ascending order
				if (directoryList.size() > 0) {
					Collections.sort(directoryList);
					System.out.println(directoryList.toString());
					
				} else {
					System.out.println("The directory list is currently empty.");
					
				}
			}
			
			// cleaning up output
			System.out.println("\n======================================\n");
			input = null;
		}
		
		scanner.close();
	}

	public static void userActions(ArrayList<String> directoryList) {
		String inputChange = null;
		String fileName = null;
		
		while(true) {
			while(inputChange == null || !inputChange.equals("1") && !inputChange.equals("2") && !inputChange.equals("3") && !inputChange.equals("4")) {
				if (inputChange != null) {
					// built in input error check
					System.out.println("Invalid input. Please enter a valid input.");
				}
				System.out.println("1. Add file to the existing directory list\n"
						+ "2. Delete a file from the existing directory list\n"
						+ "3. Search a file from the main directory\n"
						+ "4. Go back to previous screen\n"
						+ "Enter your input:");
				inputChange = scanner.nextLine();
				System.out.println();
			}
			
			if (inputChange.equals("4")) {
				// go to previous screen
				break;
				
			} else if (inputChange.equals("3")) {
				// search for file name
				System.out.println("Enter file name you wish to search for: ");
				fileName = scanner.nextLine();
				if (directoryList.contains(fileName)) {
					// print file name from ArrayList
					System.out.println("File \"" + fileName + "\" was found in the current directory.");
					
				} else {
					// file not found
					System.out.println("Error: file \"" + fileName + "\" not found");
					
				}
				
			} else if (inputChange.equals("2")) {
				// delete file name
				System.out.println("Enter file name you wish to delete: ");
				fileName = scanner.nextLine();
				if (directoryList.contains(fileName)) {
					// delete from ArrayList
					directoryList.remove(fileName);
					System.out.println("File \"" + fileName + "\" successfully deleted.");
					
				} else {
					// file not found
					System.out.println("Error: file \"" + fileName + "\" not found");
					
				}
				
			} else if (inputChange.equals("1")) {
				// add file name
				System.out.println("Enter file name you wish to add: ");
				fileName = scanner.nextLine();
				directoryList.add(fileName);
				System.out.println("File \"" + fileName + "\" successfully added.");
				
			}
			
			// cleaning up output
			System.out.println("\n======================================\n");
			inputChange = null;
		}
	}
}
