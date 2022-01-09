package com.grupp6a.competition;

import com.grupp6a.competitor.Competitor;

public class TimeManagement {

	// Metod som simulerar tävlingen, räknar fram deltagarnas tider baserade på
	// slumpade hastigheten angiven distans på loppet samt avståndet till
	// coachen(mellantiden).

	public void race(int distance, double coach, Competitor p[]) {

		double distanceToCoach;
		double timeToCoach = 0;
		double distanceToFinish;
		double timeToFinish;

		distanceToCoach = (coach * 1000);
		distanceToFinish = (distance * 1000) - distanceToCoach;

		for (int i = 0; i < p.length; i++) {
			p[i].randomizeSpeed(p[i].getGender());
			timeToCoach = distanceToCoach / p[i].getSpeed();
			p[i].setMellantider(0, Math.round(timeToCoach * 100.0) / 100.0);
			p[i].randomizeSpeed(p[i].getGender());
			timeToFinish = distanceToFinish / p[i].getSpeed();
			p[i].setMellantider(1, (Math.round(timeToFinish * 100.0) / 100.0) + p[i].getMellantider(0));
		}
	}

	// Metod som räknar ut timme,minut,sekund och hundradelar och formatterar
	// utskriften.
	public void convert(Competitor p[]) {
		String format = "";

		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j <= 1; j++) {
				int HH = (int) p[i].getMellantider(j) / 3600;
				int MM = (int) (p[i].getMellantider(j) - (HH * 3600)) / 60;
				int SS = (int) p[i].getMellantider(j) % 60;
				double x = (double) p[i].getMellantider(j) * 100;
				int y = (int) p[i].getMellantider(j) * 100;
				int MS = (int) x - y;
				format = String.format("%02d:%02d:%02d:%02d", HH, MM, SS, MS);

				p[i].setRes(j, format);
			}
		}
	}

	// Metod som räknar ut timme,minut,sekund och hundradelar och formatterar.
	// Används vid intervallen för att skriva ut klockslag.
	// Samma koncept som "convert" metoden ovan, men räknar med deltagarens
	// starttid.
	public void clockAtInterval(Competitor p[]) {

		String format = "";
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j <= 1; j++) {
				int HH = (int) (p[i].getMellantider(j) + p[i].getStartTid()) / 3600;
				int MM = (int) ((p[i].getMellantider(j) + p[i].getStartTid()) - (HH * 3600)) / 60;
				int SS = (int) (p[i].getMellantider(j) + p[i].getStartTid()) % 60;
				double x = (double) (p[i].getMellantider(j) + p[i].getStartTid()) * 100;
				int y = (int) (p[i].getMellantider(j) + p[i].getStartTid()) * 100;
				int MS = (int) x - y;
				format = String.format("%02d:%02d:%02d:%02d", HH, MM, SS, MS);

				p[i].setClock(j, format);
			}
		}
	}
}
