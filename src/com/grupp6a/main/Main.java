package com.grupp6a.main;

import com.grupp6a.userInput.UserInput;
import com.grupp6a.userinterface.PrintToConsole;

public class Main {

	public static void main(String[] args) {

		PrintToConsole ptc = new PrintToConsole();
		UserInput ui = new UserInput();
		ptc.welcomeUser();
		ptc.startMenu();
		ProgramLoop pL = new ProgramLoop();

		pL.startMenuCases(ui.userChoice(3));

	}

}
