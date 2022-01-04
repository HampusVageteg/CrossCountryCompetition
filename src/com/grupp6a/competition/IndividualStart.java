package com.grupp6a.competition;

import java.util.Arrays;

import com.grupp6a.compare.TotalTimeToIntervalComparator;
import com.grupp6a.compare.ContestantIntervalComparator;
import com.grupp6a.competitor.Person;
import com.grupp6a.userinterface.PrintToConsole;

// Subklass till Competition.

public class IndividualStart extends Competition {

	private PrintToConsole ptc = new PrintToConsole();
	
	TotalTimeToIntervalComparator comp = new TotalTimeToIntervalComparator();

	public IndividualStart() {
		super();

	}

	public IndividualStart(int participants, char gender, int distance, double coach) {
		super();
		setParticipants(participants);
        setGender(gender);
        setDistance(distance);
        setCoach(coach);
        this.p = new Person[participants];

	}

	// Metod som sorterar arrayen baserat på första intervallen
	public void intervalOne(int u) {
		Arrays.sort(IndividualStart.this.p, new ContestantIntervalComparator());
		clockAtInterval();
		ptc.resultFormatet();
		for (int i = 0; i < IndividualStart.this.getParticipants(); i++) {
			IndividualStart.this.p[i].setPlacement(i + 1);
			convert();
			System.out.println(IndividualStart.this.p[i].toString(u));

		}
	}

	// Metod som sorterar arrayen baserat på målgången.
	public void lastInterval(int u) {
		Arrays.sort(IndividualStart.this.p);
		clockAtInterval();
		ptc.resultFormatFinish();
		for (int i = 0; i < IndividualStart.this.getParticipants(); i++) {
			IndividualStart.this.p[i].setPlacement(i + 1);
			convert();
			System.out.println(IndividualStart.this.p[i].toString(u));
		}
	}

	// Metod som sorterar tid för målgång och skriver ut toString metoden.
	public void finalresult() {
		Arrays.sort(IndividualStart.this.p);
		ptc.resultFormat();
		for (int i = 0; i < IndividualStart.this.getParticipants(); i++) {
			IndividualStart.this.p[i].setPlacement(i + 1);
			convert();
			clockAtInterval();
			System.out.println(IndividualStart.this.p[i].toString());

		}
	}

	// Metod som räknar ut timme,minut,sekund och hundradelar och formatterar
	// utskriften.
	public void convert() {
		String format = "";

		for (int i = 0; i < IndividualStart.this.getParticipants(); i++) {
			for (int j = 0; j <= 1; j++) {
				int HH = (int) IndividualStart.this.p[i].getMellantider(j) / 3600;
				int MM = (int) (IndividualStart.this.p[i].getMellantider(j) - (HH * 3600)) / 60;
				int SS = (int) IndividualStart.this.p[i].getMellantider(j) % 60;
				double x = (double) IndividualStart.this.p[i].getMellantider(j) * 100;
				int y = (int) IndividualStart.this.p[i].getMellantider(j) * 100;
				int MS = (int) x - y;
				format = String.format("%02d:%02d:%02d:%02d", HH, MM, SS, MS);

				IndividualStart.this.p[i].setRes(j, format);
			}

		}

	}

	public void analyzeContestant(int a) {
		// Sorterar p[] arreyen baserat på totaltiden (starttid + åktid) till ledarens
		// placering längs spåret.
		Arrays.sort(IndividualStart.this.p, new TotalTimeToIntervalComparator());
		for (int i = 0; i < IndividualStart.this.p.length; i++) {
			// Baserat på nya sorteringen få får deltagarna en placering.
			IndividualStart.this.p[i].setPlacement(i + 1);

		}
		// Anropar convert metoden som tillhör denna klass. Det gör vi för att snygga
		// till formatet på mellantiderna.
		convert();
		clockAtInterval();
		// Sorterar arryen på nytt, denna gång sorterar vi bara från första placeringen
		// till placeringen där vår deltagare är.
		// Exempelvis om vår deltagare är på plats 5 efter första sorteringen så
		// sorterar vi bara de 5 första platserna i arrayen.
		// Vi sorterar dessa på deras mellantider istället för totaltid
		Arrays.sort(IndividualStart.this.p, 0, IndividualStart.this.getParticipant(a).getPlacement(), new ContestantIntervalComparator());
		ptc.resultFormatet();
		for (int i = 0; i < IndividualStart.this.getParticipant(a).getPlacement(); i++) {
			// Sätter ny placering till deltagarna baserat på senaste sorteringen.
			IndividualStart.this.p[i].setPlacement(i + 1);
			// Anropar en toString metod som tillhör objektet vi analyserar.
			ptc.println(IndividualStart.this.p[i].toString(0));
		}

	}

	// Metod som räknar ut timme,minut,sekund och hundradelar och formatterar. 
	// Används vid intervallen för att skriva ut klockslag.
	public void clockAtInterval() {

		String format = "";

		for (int i = 0; i < IndividualStart.this.getParticipants(); i++) {
			for (int j = 0; j <= 1; j++) {
				int HH = (int) (IndividualStart.this.p[i].getMellantider(j) + IndividualStart.this.p[i].getStartTid())
						/ 3600;
				int MM = (int) ((IndividualStart.this.p[i].getMellantider(j) + IndividualStart.this.p[i].getStartTid())
						- (HH * 3600)) / 60;
				int SS = (int) (IndividualStart.this.p[i].getMellantider(j) + IndividualStart.this.p[i].getStartTid())
						% 60;
				double x = (double) (IndividualStart.this.p[i].getMellantider(j)
						+ IndividualStart.this.p[i].getStartTid()) * 100;
				int y = (int) (IndividualStart.this.p[i].getMellantider(j) + IndividualStart.this.p[i].getStartTid())
						* 100;
				int MS = (int) x - y;
				format = String.format("%02d:%02d:%02d:%02d", HH, MM, SS, MS);

				IndividualStart.this.p[i].setClock(j, format);
			}

		}

	}

}
