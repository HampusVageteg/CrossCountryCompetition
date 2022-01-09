package com.grupp6a.userinterface;

import com.grupp6a.competitor.Competitor;

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
		System.out.println(
				"This program simulates a cross-country competition. The program asks for certain parameters from the user and then runs the simulation based on those.\n"
						+ "Information about placement, time at the interval and time at the finish line is then displayed."
						+ "\nFor more details you can analyze a specific contestant.");
		System.out.println("\n---------------------");

	}

	public void askStartHour() {
		System.out.println("---------------------\n");
		System.out.println("When does the race start? Enter hour, 0-23");
	}

	public void askStartMin() {
		System.out.println("---------------------\n");
		System.out.println("When does the race start? Enter minute, 0-59");
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
		System.out.println(
				"Placement" + "\t" + "Start number" + "\t" + "Interval " + "\t" + "\t" + "Timestamp at interval ");
	}

	public void resultFormatFinish() {
		System.out.println("---------------------");
		System.out.println(
				"Placement" + "\t" + "Start number" + "\t" + "Finish" + "\t" + "\t" + "\t" + "Timestamp at Finish");

	}

	public void resultFormat() {

		System.out.println("---------------------");
		System.out.println("Name" + "\t" + "\t" + "\t" + "\t" + "Placement" + "\t" + "\t" + "Start number" + "\t" + "\t"
				+ "Interval " + "\t" + "\t" + "Finish" + "\t" + "\t" + "\t" + "Timestamp at Finish");
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

	public void competitorInfo(Competitor c1) {
		System.out.println("---------------------");
		System.out.println("Contestant: " + c1.getFullName());
		System.out.println("Start number: " + c1.getStartNum());
		System.out.println("Start time: " + c1.converter(c1.getStartTid()));
		System.out.println("Time to interval: " + c1.converter(c1.getMellantider()[0]));
		System.out.println("Race time: " + c1.converter(c1.getMellantider()[1]));
		System.out.println("Time at finish line: " + c1.getClock()[1]);
	}

	public void print(String x) {
		System.out.print(x);
	}

	public void println(String x) {
		System.out.println(x);
	}
}
