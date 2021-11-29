package com.grupp6a.main;


import com.grupp6a.competition.Competition;
import com.grupp6a.competitor.Person;
import com.grupp6a.userInput.UserInput;
import com.grupp6a.userinterface.PrintToConsole;

public class Main {

	public static void main(String[] args) {

		PrintToConsole.welcomeUser();
		PrintToConsole.startMenu();

		int choice = UserInput.userChoice(3);

		ProgramLoop.firstBranch(choice);
		
		
	

	}

}
