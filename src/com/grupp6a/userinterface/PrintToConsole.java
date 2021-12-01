package com.grupp6a.userinterface;

public class PrintToConsole {
	
	public PrintToConsole() {};

	public void welcomeUser() {

		System.out.println("Welcome to the cross-country competition 2000!");
		System.out.println("----------------------------------------------");
	}

	public void startMenu() {

		System.out.println("Choose one of the following options: ");

		System.out.println("1. Start new competition");
		System.out.println("2. Instructions");
		System.out.println("3. Exit program");

	}

	public void startMenu2() {

		System.out.println("Choose one of the following options: ");

		System.out.println("1. View result");
		System.out.println("2. Start new competition");
		System.out.println("3. Instructions");
		System.out.println("4. Exit program");

	}

	public void chooseFormat() {

		System.out.println("---------------------");
		System.out.println("1. Individual start");
		System.out.println("2. Mass start");

	}

	public void chooseFormat2() {

		System.out.println("---------------------");
		System.out.println("1. Individual start");
		System.out.println("2. Mass start");
		System.out.println("3. Pursuit start");

	}
	
	public void instructions() {
		
		System.out.println("---------------------\n");
		System.out.println("test");
		
	}
	
	public void askParticipants() {
		
		System.out.println("---------------------\n");
		System.out.println("How many participants? \nMax amount is 150");
		
	}
	
	public void askDistance() {
		
		System.out.println("---------------------\n");
		System.out.println("How long race distance? \nAnswer in km, max 50km");
	}
	
	public void askGender() {
		
		System.out.println("---------------------\n");
		System.out.println("Enter gender m/f?");
	}

	public void invalidInput() {

		System.out.println("---------------------");
		System.out.println("Invalid input, please try again!");
	}
	public void resultFormat() {
		
		System.out.println("---------------------");
		System.out.println("Placering" +"\t"+ "Startnummer" + "\t" + "Mellantid 1" + "\t"+"\t" + "Mellantid 2" + "\t"+"\t" + "Mellantid 3" + "\t"+"\t" + "Mellantid 4" + "\t"+"\t"+ "Målgång");
	}
	public void resultMenu() {
		
		System.out.println("---------------------");
		System.out.println("Choose one of the following options: ");

		System.out.println("1. View result");
		System.out.println("2. Check standings at interval");
		System.out.println("3. Analyze contestant");
		System.out.println("4. Start new competition");
	
	}
	
	public void intervalMenu() {
		
		System.out.println("---------------------");
		System.out.println("Choose one of the following intervals: ");
		System.out.println("1. Interval 1");
		System.out.println("2. Interval 2");
		System.out.println("3. Interval 3");
		System.out.println("4. Interval 4");
		System.out.println("5. Previous menu");
		
	}

}
