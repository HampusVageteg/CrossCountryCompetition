package com.grupp6a.main;


import java.util.Arrays;

import com.grupp6a.competition.Competition;
import com.grupp6a.competition.IndividualStart;
import com.grupp6a.competitor.Person;
import com.grupp6a.userInput.UserInput;
import com.grupp6a.userinterface.PrintToConsole;

public class Main {

	public static void main(String[] args) {
		
		
		final IndividualStart i1= new IndividualStart();

		PrintToConsole.welcomeUser();
		PrintToConsole.startMenu();

		ProgramLoop.startMenuCases(UserInput.userChoice(3));
		
		
	}

}
