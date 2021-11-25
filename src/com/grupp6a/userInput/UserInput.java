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
				if (input > 0 && input <= limit) {
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

	public static char inputChar() {

		String choice = "M";
		boolean validInput = false;

		do {
			try {
				choice = scan.nextLine().toUpperCase();

				if (choice.equals("M") || choice.equals("F")) {
					validInput = true;
				}else {
					PrintToConsole.invalidInput();
				}

			} catch (StringIndexOutOfBoundsException ex) {
				PrintToConsole.invalidInput();
				scan.nextLine();
			}
		} while (!validInput);

		char charTest = choice.charAt(0);
		return charTest;

	}

}
