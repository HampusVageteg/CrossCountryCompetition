package com.grupp6a.competition;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import com.grupp6a.competitor.Person;
import com.grupp6a.userinterface.PrintToConsole;

// Subklass till Competition.

public class IndividualStart extends Competition {

	private PrintToConsole ptc = new PrintToConsole();
//	private SortByInterval sbi = new SortByInterval();

	public IndividualStart() {
		super();

	}

	public IndividualStart(int participants, char gender, int distance) {
		super();
		this.participants = participants;
		this.gender = gender;
		this.distance = distance;
		this.p = new Person[participants];
	}

//	public class SortByInterval implements Comparator<Person> {
//		@Override
//		public int compare(Person p1, Person p2) {
//			int i;
//			if (p1.getMellantider(0) == p2.getMellantider(0)) {
//				i = 0;
//			} else if (p1.getMellantider(0) > p2.getMellantider(0)) {
//				i = 1;
//			} else {
//				i = -1;
//			}
//
//			return i;
//
//		}
//		
//
//	}

	public void intervalOne(int u) {
		Arrays.sort(IndividualStart.super.getP(), Comparator.comparing(p -> p.getMellantider(u)));

		ptc.resultFormat();
		for (int i = 0; i < IndividualStart.super.getParticipants(); i++) {
			IndividualStart.super.getP(i).setPlacement(i + 1);
			convert();
			System.out.println(IndividualStart.super.getP(i).toString());

		}
	}

	// Metod som sorterar tid för målgång och skriver ut "tillstring" metoden.
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
			for (int j = 0; j <= 4; j++) {
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

}
