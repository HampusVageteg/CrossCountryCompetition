package com.grupp6a.main;

import com.grupp6a.userInput.UserInput;
import com.grupp6a.userinterface.PrintToConsole;

public class Main {

	public static void main(String[] args) {

		PrintToConsole ptc = new PrintToConsole();
		UserInput ui = new UserInput();
		ProgramLoop pL = new ProgramLoop();
		
		ptc.welcomeUser();
		ptc.startMenu();
		pL.startMenuCases(ui.userChoice(3));

	}

}
