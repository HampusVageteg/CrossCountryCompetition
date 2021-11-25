package com.grupp6a.main;

import com.grupp6a.competition.Competition;
import com.grupp6a.competition.IndividualStart;
import com.grupp6a.competition.MassStart;
import com.grupp6a.userInput.UserInput;
import com.grupp6a.userinterface.PrintToConsole;

public class ProgramLoop {

	private static int numOfParticipants;
	private static int distance;
	private static char gender;
	
	
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
			IndividualStart test = new IndividualStart();
			
			PrintToConsole.askParticipants();
			numOfParticipants = UserInput.userChoice(150);
			test.setParticipants(numOfParticipants);
			
			PrintToConsole.askDistance();
			distance = UserInput.userChoice(50);
			test.setDistance(distance);
			
			PrintToConsole.askGender();
			gender = UserInput.inputChar();
			test.setGender(gender);
			break;

		case 2:
			MassStart m1 = new MassStart();
			
			PrintToConsole.askParticipants();
			numOfParticipants = UserInput.userChoice(150);
			m1.setParticipants(numOfParticipants);
			
			PrintToConsole.askDistance();
			distance = UserInput.userChoice(50);
			m1.setDistance(distance);
			
			PrintToConsole.askGender();
			gender = UserInput.inputChar();
			m1.setGender(gender);
			System.out.println(m1.toString());
			break;

		}

	}

}
