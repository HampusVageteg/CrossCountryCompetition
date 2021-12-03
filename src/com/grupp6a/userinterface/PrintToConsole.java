package com.grupp6a.userinterface;

public class PrintToConsole {

	public PrintToConsole() {
	};

	public void welcomeUser() {

		System.out.println("Welcome!");
		System.out.println("----------------------------------------------");
	}

	public void startMenu() {

		System.out.println("Choose one of the following options: ");

		System.out.println("1. Start new competition");
		System.out.println("2. Instructions");
		System.out.println("3. Exit program");

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

	public void askCoach() {

		System.out.println("---------------------\n");
		System.out.println("Where is the coach, answer in km:");

	}

	public void invalidInput() {

		System.out.println("---------------------");
		System.out.println("Invalid input, please try again!");
	}


	public void resultFormatet() {
		System.out.println("---------------------");
		System.out.println("Placering" + "\t" + "Startnummer" + "\t" + "Mellantid ");
	}
	
	public void resultFormat() {
		
		System.out.println("---------------------");
		System.out.println("Placering" + "\t" + "\t" + "Startnummer" + "\t" + "\t" + "Mellantid " + "\t" + "\t" + "M�lg�ng");
	}


	public void resultMenu() {

		System.out.println("---------------------");
		System.out.println("Choose one of the following options: ");

		System.out.println("1. View result");
		System.out.println("2. Check standings at interval");
		System.out.println("3. Analyze contestant");
		System.out.println("4. Start new competition");
		System.out.println("5. Exit program");

	}

	public void intervalMenu() {

		System.out.println("---------------------");
		System.out.println("Choose one of the following intervals: ");
		System.out.println("1. Interval 1");
		System.out.println("2. Finish line");
		System.out.println("3. Previous menu");

	}
	
	public void exitProgram() {
		System.out.println("Closing application!");
	}
	
	public void analyzeMenu() {
		
		System.out.println("---------------------");
		System.out.println("Choose a start number to analyze");
		
	}

	public void print(String x) {
		System.out.print(x);
	}

	public void println(String x) {
		System.out.println(x);
	}
}
