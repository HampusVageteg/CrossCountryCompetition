package com.grupp6a.competition;

import java.util.Arrays;

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
		Arrays.sort(IndividualStart.this.p, new CompareTwo());

		ptc.resultFormatet();
		for (int i = 0; i < IndividualStart.this.participants; i++) {
			IndividualStart.this.p[i].setPlacement(i + 1);
			convert();
			System.out.println(IndividualStart.this.p[i].toString(u));

		}
	}

	public void lastInterval(int u) {
		Arrays.sort(IndividualStart.this.p);
		ptc.resultFormatFinish();
		for (int i = 0; i < IndividualStart.this.participants; i++) {
			IndividualStart.this.p[i].setPlacement(i + 1);
			convert();
			System.out.println(IndividualStart.this.p[i].toString(u));
		}
	}

	// Metod som sorterar tid f�r m�lg�ng och skriver ut toString metoden.
	public void finalresult() {
		Arrays.sort(IndividualStart.this.p);
		ptc.resultFormat();
		for (int i = 0; i < IndividualStart.this.participants; i++) {
			IndividualStart.this.p[i].setPlacement(i + 1);
			convert();
			System.out.println(IndividualStart.this.p[i].toString());

		}
	}

	// Metod som r�knar ut timme,minut,sekund och hundradelar och formatterar
	// utskriften.
	public void convert() {
		String format = "";

		for (int i = 0; i < IndividualStart.this.participants; i++) {
			for (int j = 0; j <= 1; j++) {
				int hour = (int) IndividualStart.this.p[i].getMellantider(j) / 3600;
				int min = (int) (IndividualStart.this.p[i].getMellantider(j) - (hour * 3600)) / 60;
				int sec = (int) IndividualStart.this.p[i].getMellantider(j) % 60;
				double x = (double) IndividualStart.this.p[i].getMellantider(j) * 100;
				int y = (int) IndividualStart.this.p[i].getMellantider(j) * 100;
				int decimaler = (int) x - y;
				format = String.format("%02d:%02d:%02d:%02d", hour, min, sec, decimaler);

				IndividualStart.this.p[i].setRes(j, format);
			}

		}

	}

	public void analyzeContestant(int a) {
		// Sorterar p[] arreyen baserat p� totaltiden (starttid + �ktid) till ledarens
		// placering l�ngs sp�ret.
		Arrays.sort(IndividualStart.this.p, new Compare());
		for (int i = 0; i < IndividualStart.this.p.length; i++) {
			// Baserat p� nya sorteringen f� f�r deltagarna en placering.
			IndividualStart.this.p[i].setPlacement(i + 1);

		}
		// Anropar convert metoden som tillh�r denna klass. Det g�r vi f�r att snygga
		// till formatet p� mellantiderna.
		convert();
		// Sorterar arryen p� nytt, denna g�ng sorterar vi bara fr�n f�rsta placeringen
		// till placeringen d�r v�r deltagare �r.
		// Exempelvis om v�r deltagare �r p� plats 5 efter f�rsta sorteringen s�
		// sorterar vi bara de 5 f�rsta platserna i arrayen.
		// Vi sorterar dessa p� deras mellantider ist�llet f�r totaltid
		Arrays.sort(IndividualStart.this.p, 0, IndividualStart.this.getParticipant(a).getPlacement(), new CompareTwo());
		ptc.resultFormatet();
		for (int i = 0; i < IndividualStart.this.getParticipant(a).getPlacement(); i++) {
			// S�tter ny placering till deltagarna baserat p� senaste sorteringen.
			IndividualStart.this.p[i].setPlacement(i + 1);
			// Anropar en toString metod som tillh�r objektet vi analyserar.
			ptc.println(IndividualStart.this.p[i].toString(0));
		}

	}

}
