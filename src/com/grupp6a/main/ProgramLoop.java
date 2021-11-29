package com.grupp6a.main;

import com.grupp6a.competition.IndividualStart;
import com.grupp6a.competition.MassStart;
import com.grupp6a.competitor.Person;
import com.grupp6a.userInput.UserInput;
import com.grupp6a.userinterface.PrintToConsole;

public class ProgramLoop {

	private static int numOfParticipants = 0;
	private static int distance = 0;
	private static char gender = 'x';

	public static void firstBranch(int choice) {

		switch (choice) {
		case 1:
			PrintToConsole.chooseFormat();
			int choicetwo = UserInput.userChoice(2);
			test(choicetwo);
			break;
		case 2:
			PrintToConsole.instructions();
			break;
		case 3:
			System.exit(0);
			break;

		}
	}

	public static void test(int choicetwo) {

		switch (choicetwo) {
		case 1:
			// Individuell tävling

			PrintToConsole.askParticipants();
			numOfParticipants = UserInput.userChoice(150);

			PrintToConsole.askDistance();
			distance = UserInput.userChoice(50);

			PrintToConsole.askGender();
			gender = UserInput.inputChar();

			IndividualStart i1 = new IndividualStart(numOfParticipants, gender, distance);
			i1.fillArray(i1.getParticipants());

			for (int i = 0; i < i1.getParticipants(); i++) {
				i1.getP(i).race(i1.getDistance(), 5);
				System.out.println(i1.getP(i).toString());
			}

			break;

		case 2:
			// MassStart tävling

			PrintToConsole.askParticipants();
			numOfParticipants = UserInput.userChoice(150);

			PrintToConsole.askDistance();
			distance = UserInput.userChoice(50);

			PrintToConsole.askGender();
			gender = UserInput.inputChar();

			MassStart m1 = new MassStart(numOfParticipants, gender, distance);

			m1.fillArray(m1.getParticipants());

			for (int i = 0; i < m1.getParticipants(); i++) {
				m1.getP(i).race(m1.getDistance(), 5);
				System.out.println(m1.getP(i).toString());
			}
			break;

		}

	}

}
