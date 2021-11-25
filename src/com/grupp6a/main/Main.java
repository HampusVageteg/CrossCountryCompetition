package com.grupp6a.main;

import com.grupp6a.competition.Competition;
import com.grupp6a.competitor.Person;
import com.grupp6a.userinterface.PrintToConsole;

public class Main {

	public static void main(String[] args) {
		
		PrintToConsole.welcomeUser();

		Person p1 = new Person("Male", "Anders", 54, 1, 5, 6.5);

		Competition c1 = new Competition(1, "Male", 10);
		
		System.out.println(p1.race(c1.getDistance(), c1.getIntervals()));
		
		System.out.println("\nVINSTEN GÅR TILL " + p1.getName() + ", GRATTIS!");
		
		

	}

}
