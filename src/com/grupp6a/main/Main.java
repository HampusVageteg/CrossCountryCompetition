package com.grupp6a.main;


import java.util.Arrays;

import com.grupp6a.competition.Competition;
import com.grupp6a.competition.IndividualStart;
import com.grupp6a.competitor.Person;
import com.grupp6a.userInput.UserInput;
import com.grupp6a.userinterface.PrintToConsole;

public class Main {

	public static void main(String[] args) {
		
		
		PrintToConsole ptc = new PrintToConsole();
		UserInput ui = new UserInput();
		ptc.welcomeUser();
		ptc.startMenu();
		ProgramLoop pL = new ProgramLoop();

//		ProgramLoop.startMenuCases(UserInput.userChoice(3));
		
		pL.startMenuCases(ui.userChoice(3));
		
	}

}
