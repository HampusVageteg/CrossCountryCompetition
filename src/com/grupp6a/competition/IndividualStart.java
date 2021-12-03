package com.grupp6a.competition;

import java.util.Arrays;
import java.util.Comparator;

import com.grupp6a.compare.Compare;
import com.grupp6a.compare.CompareTwo;
import com.grupp6a.competitor.Person;
import com.grupp6a.userinterface.PrintToConsole;

// Subklass till Competition.

public class IndividualStart extends Competition {

	private PrintToConsole ptc = new PrintToConsole();
	

	public IndividualStart() {
		super();

	}

	public IndividualStart(int participants, char gender, int distance, double coach) {
		super();
		this.participants = participants;
		this.gender = gender;
		this.distance = distance;
		this.coach = coach;
		this.p = new Person[participants];

	}

	public void intervalOne(int u) {
		Arrays.sort(IndividualStart.super.getP(), Comparator.comparing(p -> p.getMellantider(u)));

		ptc.resultFormatet();
		for (int i = 0; i < IndividualStart.super.getParticipants(); i++) {
			IndividualStart.super.getP(i).setPlacement(i + 1);
			convert();
			System.out.println(IndividualStart.super.getP(i).toString(u));

		}
	}

	// Metod som sorterar tid för målgång och skriver ut toString metoden.
	public void finalresult() {
		Arrays.sort(IndividualStart.super.getP());
		ptc.resultFormat();
		for (int i = 0; i < IndividualStart.super.getParticipants(); i++) {
			IndividualStart.super.getP(i).setPlacement(i + 1);
			convert();
			System.out.println(IndividualStart.super.getP(i).toString());

		}
	}

	// Metod som räknar ut timme,minut,sekund och hundradelar och formatterar
	// utskriften.
	public void convert() {
		String format = "";

		for (int i = 0; i < IndividualStart.super.getParticipants(); i++) {
			for (int j = 0; j <= 1; j++) {
				int hour = (int) IndividualStart.super.getP(i).getMellantider(j) / 3600;
				int min = (int) (IndividualStart.super.getP(i).getMellantider(j) - (hour * 3600)) / 60;
				int sec = (int) IndividualStart.super.getP(i).getMellantider(j) % 60;
				double x = (double) IndividualStart.super.getP(i).getMellantider(j) * 100;
				int y = (int) IndividualStart.super.getP(i).getMellantider(j) * 100;
				int decimaler = (int) x - y;
				format = String.format("%02d:%02d:%02d:%02d", hour, min, sec, decimaler);

				IndividualStart.super.getP(i).setRes(j, format);
			}

		}

	}
	
	public void analyzeContestant(int a) {
		// Sorterar p[] arreyen baserat på totaltiden (starttid + åktid) till ledarens placering längs spåret.
		Arrays.sort(IndividualStart.super.getP(), new Compare());
		for (int i = 0; i < IndividualStart.super.getP().length; i++) {
			//Baserat på nya sorteringen få får deltagarna en placering.
			IndividualStart.super.getP(i).setPlacement(i + 1);
//		
		}
		// Anropar convert metoden som tillhör denna klass. Det gör vi för att snygga till formatet på mellantiderna.
		convert();
		// Sorterar arryen på nytt, denna gång sorterar vi bara från första placeringen till placeringen där vår deltagare är.
		// Exempelvis om vår deltagare är på plats 5 efter första sorteringen så sorterar vi bara de 5 första platserna i arrayen.
		// Vi sorterar dessa på deras mellantider istället för totaltid
		Arrays.sort(IndividualStart.super.getP(), 0, IndividualStart.super.getParticipant(a).getPlacement(), new CompareTwo());
		ptc.resultFormatet();
		for (int i = 0; i < IndividualStart.super.getParticipant(a).getPlacement(); i++) {
			// Sätter ny placering till deltagarna baserat på senaste sorteringen.
			IndividualStart.super.getP(i).setPlacement(i + 1);
			// Anropar en toString metod som tillhör objektet vi analyserar.
			ptc.println(IndividualStart.super.getP(i).toString(0));
		}
		
		
		
	
	}
	
}
