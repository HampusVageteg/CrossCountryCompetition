package com.grupp6a.userinterface;

public class PrintToConsole {

	public static void welcomeUser() {

		System.out.println("Welcome to the cross-country competition 2000!");
		System.out.println("----------------------------------------------");
	}

	public static void startMenu() {

		System.out.println("Choose one of the following options: ");

		System.out.println("1. Start new competition");
		System.out.println("2. Instructions");
		System.out.println("3. Exit program");

	}

	public static void startMenu2() {

		System.out.println("Choose one of the following options: ");

		System.out.println("1. View result");
		System.out.println("2. Start new competition");
		System.out.println("3. Instructions");
		System.out.println("4. Exit program");

	}

	public static void chooseFormat() {

		System.out.println("---------------------");
		System.out.println("1. Individual start");
		System.out.println("2. Mass start");

	}

	public static void chooseFormat2() {

		System.out.println("---------------------");
		System.out.println("1. Individual start");
		System.out.println("2. Mass start");
		System.out.println("3. Pursuit start");

	}
	
	public static void instructions() {
		
		System.out.println("---------------------\n");
		System.out.println("test");
		
	}
	
	public static void askParticipants() {
		
		System.out.println("---------------------\n");
		System.out.println("How many participants? \nMax amount is 150");
		
	}
	
	public static void askDistance() {
		
		System.out.println("---------------------\n");
		System.out.println("How long race distance? \nAnswer in km, max 50km");
	}
	
	public static void askGender() {
		
		System.out.println("---------------------\n");
		System.out.println("Enter gender male/female");
	}

	public static void invalidInput() {

		System.out.println("---------------------");
		System.out.println("Invalid input, please try again!");
	}

}
