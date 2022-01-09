package com.grupp6a.competition;

import java.util.Arrays;

import com.grupp6a.compare.TotalTimeToIntervalComparator;
import com.grupp6a.compare.ContestantIntervalComparator;
import com.grupp6a.competitor.Competitor;
import com.grupp6a.userinterface.PrintToConsole;

// Subklass till Competition.

public class IndividualStart extends Competition {

	private PrintToConsole ptc = new PrintToConsole();
	private TimeManagement tm = new TimeManagement();

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
		setP(new Competitor[participants]);

	}

	// Fyller upp objektarrayen med personobjekt, baserat på hur många participants
	// är med.
	public void addParticipants(int participants) {

		for (int i = 0; i < participants; i++) {
			getP()[i] = new Competitor(getGender());
			getP()[i].setStartNum(i + 1);
			getP()[i].setStartTid();
		}

	}

	// Metod som sorterar arrayen baserat på första intervallen
	public void intervalOne(int u) {
		Arrays.sort(getP(), new ContestantIntervalComparator());
		tm.clockAtInterval(getP());
		ptc.resultFormatet();
		for (int i = 0; i < getParticipants(); i++) {
			getP()[i].setPlacement(i + 1);
			tm.convert(getP());
			ptc.println(getP()[i].infoAtInterval(u));

		}
	}

	// Metod som sorterar arrayen baserat på målgången.
	public void lastInterval(int u) {
		// sorterar baserat på personklassens compareTo
		Arrays.sort(getP());
		tm.clockAtInterval(getP());
		ptc.resultFormatFinish();
		for (int i = 0; i < getParticipants(); i++) {
			getP()[i].setPlacement(i + 1);
			tm.convert(getP());
			ptc.println(getP()[i].infoAtInterval(u));
		}
	}

	// Metod som sorterar tid för målgång och skriver ut toString metoden.
	public void finalresult() {
		// sorterar baserat på personklassens compareTo
		Arrays.sort(getP());
		ptc.resultFormat();
		for (int i = 0; i < getParticipants(); i++) {
			getP()[i].setPlacement(i + 1);
			tm.convert(getP());
			tm.clockAtInterval(getP());
			ptc.println(getP()[i].toString());

		}
	}

	/*
	 * Sorterar p[] arreyen baserat på totaltiden (starttid + åktid). Väljer array,
	 * anropar extern comparator. Baserat på nya sorteringen få får deltagarna en
	 * placering. Anropar convert metoden via tm. Det gör vi för att snygga till
	 * formatet på mellantiderna.
	 * 
	 * Sorterar arryen på nytt, denna gång sorterar vi bara från första placeringen
	 * till placeringen där vår deltagare befinner sig. Exempelvis om vår deltagare
	 * är på plats 5 efter första sorteringen så sorterar vi bara de 5 första
	 * platserna i arrayen. Vi sorterar dessa på deras mellantider istället för
	 * totaltid
	 * 
	 * Väljer array som ska sorteras, väljer vilket index den ska sortera ifrån,
	 * väljer vilket index den ska sortera till, anorpar extern comparator.
	 * 
	 * Sätter ny placering till deltagarna baserat på senaste sorteringen. Anropar
	 * en toString metod som tillhör objektet vi analyserar.
	 */

	public void analyzeContestant(int a) {

		Arrays.sort(getP(), new TotalTimeToIntervalComparator());
		for (int i = 0; i < getP().length; i++) {
			getP()[i].setPlacement(i + 1);
		}
		tm.convert(getP());
		tm.clockAtInterval(getP());
		Arrays.sort(getP(), 0, getParticipant(a).getPlacement(), new ContestantIntervalComparator());
		ptc.resultFormatet();
		for (int i = 0; i < getParticipant(a).getPlacement(); i++) {
			getP()[i].setPlacement(i + 1);
			ptc.println(getP()[i].infoAtInterval(0));
		}

	}

}
