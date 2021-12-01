package com.grupp6a.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

import com.grupp6a.competition.Competition;
import com.grupp6a.competition.IndividualStart;
import com.grupp6a.competition.MassStart;
import com.grupp6a.competitor.Person;
import com.grupp6a.userInput.UserInput;
import com.grupp6a.userinterface.PrintToConsole;

public class ProgramLoop {

	private int numOfParticipants = 0;
	private int distance = 0;
	private char gender = 'x';
	private IndividualStart i1;
	private MassStart m1;
	private PrintToConsole ptc = new PrintToConsole();
	private UserInput ui = new UserInput();

	public void startMenuCases(int userInput) {

		switch (userInput) {
		case 1:
			ptc.chooseFormat();
			chooseFormat(ui.userChoice(2));
			break;
		case 2:
			ptc.instructions();
			break;
		case 3:
			System.exit(0);
			break;

		}
	}

	public void chooseFormat(int userInput) {

		switch (userInput) {
		case 1:
			// Individuell t�vling

			ptc.askParticipants();
			numOfParticipants = ui.userChoice(150);

			ptc.askDistance();
			distance = ui.userChoice(50);

			ptc.askGender();
			gender = ui.inputChar();

			i1 = new IndividualStart(numOfParticipants, gender, distance);
			i1.fillArray(i1.getParticipants());

			for (int i = 0; i < i1.getParticipants(); i++) {
				i1.getP(i).race(i1.getDistance(), 5);

			}

			ptc.resultMenu();
			showResult(ui.userChoice(4));
			break;

		case 2:
			// MassStart t�vling

			ptc.askParticipants();
			numOfParticipants = ui.userChoice(150);

			ptc.askDistance();
			distance = ui.userChoice(50);

			ptc.askGender();
			gender = ui.inputChar();

			m1 = new MassStart(numOfParticipants, gender, distance);

			m1.fillArray(m1.getParticipants());

			for (int i = 0; i < m1.getParticipants(); i++) {
				m1.getP(i).race(m1.getDistance(), 5);
				System.out.println(m1.getP(i).toString());
			}
			break;

		}

	}

	// Kom ih�g att ornda s� �ven masstart samt jakt g�r att visa.
	public void showResult(int a) {
		switch (a) {

		case 1:
			i1.finalresult();
			break;
		case 2:
			ptc.intervalMenu();
			checkStandings(ui.userChoice(5));
			break;
		case 3:

			break;
		case 4:

			break;

		}
	}

	// Meny
	public void checkStandings(int b) {
		switch (b) {

		case 1:
			// SORTERA INTERVAL 1
			break;
		case 2:
			// SORTERA INTERVAL 2
			break;

		case 3:
			// SORTERA INTERVAL 3
			break;

		case 4:
			// SORTERA INTERVAL 4
			break;

		case 5:
			ptc.resultMenu();
			showResult(ui.userChoice(4));
			break;
		}

	}

}
