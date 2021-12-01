package com.grupp6a.userInput;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.grupp6a.userinterface.PrintToConsole;

public class UserInput {

	static Scanner scan = new Scanner(System.in);
	private PrintToConsole ptc = new PrintToConsole();

	public int userChoice(int limit) {

		boolean validInput = false;
		int input = 0;

		do {
			try {
				input = scan.nextInt();
				if (input > 0 && input <= limit) {
					validInput = true;
				} else {
					ptc.invalidInput();

				}
			} catch (InputMismatchException ex) {
				ptc.invalidInput();
				scan.nextLine();
			}

		} while (!validInput);

		scan.nextLine();
		return input;

	}

	public char inputChar() {

		String choice = "M";
		boolean validInput = false;

		do {
			try {
				choice = scan.nextLine().toUpperCase();

				if (choice.equals("M") || choice.equals("F")) {
					validInput = true;
				} else {
					ptc.invalidInput();
				}

			} catch (StringIndexOutOfBoundsException ex) {
				ptc.invalidInput();
				scan.nextLine();
			}
		} while (!validInput);

		char charTest = choice.charAt(0);
		return charTest;

	}

}
