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

	// Fyller upp objektarrayen med personobjekt, baserat p� hur m�nga participants
	// �r med.
	public void addParticipants(int participants) {

		for (int i = 0; i < participants; i++) {
			getP()[i] = new Competitor(getGender());
			getP()[i].setStartNum(i + 1);
			getP()[i].setStartTid();
		}

	}

	// Metod som sorterar arrayen baserat p� f�rsta intervallen
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

	// Metod som sorterar arrayen baserat p� m�lg�ngen.
	public void lastInterval(int u) {
		// sorterar baserat p� personklassens compareTo
		Arrays.sort(getP());
		tm.clockAtInterval(getP());
		ptc.resultFormatFinish();
		for (int i = 0; i < getParticipants(); i++) {
			getP()[i].setPlacement(i + 1);
			tm.convert(getP());
			ptc.println(getP()[i].infoAtInterval(u));
		}
	}

	// Metod som sorterar tid f�r m�lg�ng och skriver ut toString metoden.
	public void finalresult() {
		// sorterar baserat p� personklassens compareTo
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
	 * Sorterar p[] arreyen baserat p� totaltiden (starttid + �ktid). V�ljer array,
	 * anropar extern comparator. Baserat p� nya sorteringen f� f�r deltagarna en
	 * placering. Anropar convert metoden via tm. Det g�r vi f�r att snygga till
	 * formatet p� mellantiderna.
	 * 
	 * Sorterar arryen p� nytt, denna g�ng sorterar vi bara fr�n f�rsta placeringen
	 * till placeringen d�r v�r deltagare befinner sig. Exempelvis om v�r deltagare
	 * �r p� plats 5 efter f�rsta sorteringen s� sorterar vi bara de 5 f�rsta
	 * platserna i arrayen. Vi sorterar dessa p� deras mellantider ist�llet f�r
	 * totaltid
	 * 
	 * V�ljer array som ska sorteras, v�ljer vilket index den ska sortera ifr�n,
	 * v�ljer vilket index den ska sortera till, anorpar extern comparator.
	 * 
	 * S�tter ny placering till deltagarna baserat p� senaste sorteringen. Anropar
	 * en toString metod som tillh�r objektet vi analyserar.
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
