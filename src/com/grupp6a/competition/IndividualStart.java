package com.grupp6a.competition;

import java.util.Arrays;
import java.util.Comparator;

import com.grupp6a.userinterface.PrintToConsole;

// Subklass till Competition.

public class IndividualStart extends Competition {
	
	private PrintToConsole ptc = new PrintToConsole();
	public IndividualStart() {
		super();

	}
	
	public IndividualStart(int participants, char gender, int distance) {
		super();
		this.participants = participants;
		this.gender = gender;
		this.distance = distance;

	}
	
	public void finalresult() {
		Arrays.sort(IndividualStart.super.getP(), Comparator.nullsLast(Comparator.naturalOrder()));
		ptc.resultFormat();
		for (int i = 0; i < IndividualStart.super.getParticipants(); i++) {
			IndividualStart.super.getP(i).setPlacement(i+1);
			System.out.println(IndividualStart.super.getP(i).tillString());
			
		}
	}

}
