package com.grupp6a.userInput;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.grupp6a.userinterface.PrintToConsole;

public class UserInput {

	static Scanner scan = new Scanner(System.in);

	public static int userChoice(int limit) {

		boolean validInput = false;
		int input = 0;

		do {
			try {
				input = scan.nextInt();
				if (input > 0 && input < limit) {
					validInput = true;
				} else {
					PrintToConsole.invalidInput();
				}
			} catch (InputMismatchException ex) {
				PrintToConsole.invalidInput();
				scan.nextLine();
			}

		} while (!validInput);

		scan.nextLine();
		return input;

	}

}
