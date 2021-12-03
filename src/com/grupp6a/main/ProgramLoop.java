package com.grupp6a.main;

import com.grupp6a.competition.IndividualStart;

import com.grupp6a.userInput.UserInput;
import com.grupp6a.userinterface.PrintToConsole;

public class ProgramLoop {

	private int numOfParticipants = 0;
	private int distance = 0;
	private char gender = 'x';
	private double coach = 0;
	private IndividualStart i1;
	private PrintToConsole ptc = new PrintToConsole();
	private UserInput ui = new UserInput();

	public void startMenuCases(int userInput) {

		switch (userInput) {
		case 1:

			ptc.askParticipants();
			numOfParticipants = ui.userChoice(150);

			ptc.askDistance();
			distance = ui.userChoice(50);

			ptc.askCoach();
			coach = ui.userChoiceDouble(distance);

			ptc.askGender();
			gender = ui.inputChar();

			i1 = new IndividualStart(numOfParticipants, gender, distance, coach);
			i1.fillArray(i1.getParticipants());

			for (int i = 0; i < i1.getParticipants(); i++) {
				i1.getP(i).race(i1.getDistance(), i1.getCoach());

			}

			ptc.resultMenu();
			showResult(ui.userChoice(5));

			break;
		case 2:
			ptc.instructions();
			break;
		case 3:
			ptc.exitProgram();
			System.exit(0);
			break;

		}
	}

	public void showResult(int a) {
		switch (a) {

		case 1:
			i1.finalresult();
			ptc.resultMenu();
			showResult(ui.userChoice(5));
			break;
		case 2:
			ptc.intervalMenu();
			checkStandings(ui.userChoice(5));
			break;
		case 3:
			ptc.analyzeMenu();
			i1.analyzeContestant(ui.userChoice(numOfParticipants));
			break;
		case 4:

			break;

		case 5:
			ptc.exitProgram();
			System.exit(0);
			break;

		}
	}

	// Meny
	public void checkStandings(int b) {
		switch (b) {

		case 1:
			i1.intervalOne(0);
			ptc.resultMenu();
			showResult(ui.userChoice(5));
			break;
		case 2:
			i1.intervalOne(1);
			ptc.resultMenu();
			showResult(ui.userChoice(5));
			break;

		case 3:
			ptc.resultMenu();
			showResult(ui.userChoice(5));
			break;

		}
	}

}
