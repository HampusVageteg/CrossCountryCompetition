package com.grupp6a.competition;

import java.util.Arrays;
import java.util.Comparator;

import com.grupp6a.competitor.Person;
import com.grupp6a.userinterface.PrintToConsole;

//Subklass till Competition.
public class MassStart extends Competition {

	private PrintToConsole ptc = new PrintToConsole();

	public MassStart() {
		super();
	}

	public MassStart(int participants, char gender, int distance) {
		super();
		this.participants = participants;
		this.gender = gender;
		this.distance = distance;
		this.p = new Person[participants];

	}

	public void intervalOne(int u) {
		Arrays.sort(MassStart.super.getP(), Comparator.comparing(p -> p.getMellantider(u)));

		ptc.resultFormat(u);
		for (int i = 0; i < MassStart.super.getParticipants(); i++) {
			MassStart.super.getP(i).setPlacement(i + 1);
			convert();
			System.out.println(MassStart.super.getP(i).toString(u));

		}
	}

	// Metod som sorterar tid för målgång och skriver ut "tillstring" metoden.
	public void finalresult() {
		Arrays.sort(MassStart.super.getP());
		ptc.resultFormat();
		for (int i = 0; i < MassStart.super.getParticipants(); i++) {
			MassStart.super.getP(i).setPlacement(i + 1);
			convert();
			System.out.println(MassStart.super.getP(i).toString());

		}
	}

	// Metod som räknar ut timme,minut,sekund och hundradelar och formatterar
	// utskriften.
	public void convert() {
		String format = "";

		for (int i = 0; i < MassStart.super.getParticipants(); i++) {
			for (int j = 0; j <= 4; j++) {
				int hour = (int) MassStart.super.getP(i).getMellantider(j) / 3600;
				int min = (int) (MassStart.super.getP(i).getMellantider(j) - (hour * 3600)) / 60;
				int sec = (int) MassStart.super.getP(i).getMellantider(j) % 60;
				double x = (double) MassStart.super.getP(i).getMellantider(j) * 100;
				int y = (int) MassStart.super.getP(i).getMellantider(j) * 100;
				int decimaler = (int) x - y;
				format = String.format("%02d:%02d:%02d:%02d", hour, min, sec, decimaler);

				MassStart.super.getP(i).setRes(j, format);
			}

		}
		

	}

	@Override
	public String toString() {
		
		return "Please select a number between 1 - " + participants + ":";
	}

}
