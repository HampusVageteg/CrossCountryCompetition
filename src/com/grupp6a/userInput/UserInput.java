package com.grupp6a.userInput;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.grupp6a.userinterface.PrintToConsole;

// Kontrollerar input fr?n anv?ndaren med hj?lp av tre olika try/catch metoder.
// Beroende p? n?r det ska anv?ndas och vilken datatyp som skall skrivas.
public class UserInput {

	Scanner scan = new Scanner(System.in);
	private PrintToConsole ptc = new PrintToConsole();

	public int userChoice(int maxLimit, int minLimit) {

		boolean validInput = false;
		int input = 0;

		do {
			try {
				input = scan.nextInt();
				if (input > minLimit && input <= maxLimit) {
					validInput = true;
				} else {
					ptc.invalidInput();

				}
			} catch (InputMismatchException ex) {
				ptc.invalidInput();
				scan.nextLine();
			}

		} while (!validInput);

		
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

	public double userChoiceDouble(int limit) {

		boolean validInput = false;
		double input = 0;

		do {
			try {
				input = scan.nextDouble();
				if (input > 0 && input < limit) {
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

}
