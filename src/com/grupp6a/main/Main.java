package com.grupp6a.main;

import com.grupp6a.main.ProgramLoop;
import com.grupp6a.competition.Competition;
import com.grupp6a.competition.IndividualStart;
import com.grupp6a.competitor.Person;
import com.grupp6a.userInput.UserInput;
import com.grupp6a.userinterface.PrintToConsole;

public class Main {

	public static void main(String[] args) {

		Competition c1 = new Competition();
		

		
		
		Person p1 = new Person('M', 5);
		Person p2 = new Person('M', 2);
		
		//System.out.println("Person 1 " + p1.toString() + "\n" +  "Person 2 " + p2.toString());
	
		PrintToConsole.welcomeUser();
		PrintToConsole.startMenu();

		int choice = UserInput.userChoice(3);

		ProgramLoop.firstBranch(choice);
		
		m1.fillArray();
		m1.printArray();

		

	}

}
