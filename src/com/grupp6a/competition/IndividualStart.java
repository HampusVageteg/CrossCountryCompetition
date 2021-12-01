package com.grupp6a.competition;

import java.text.DecimalFormat;
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
			convert();
			System.out.println(IndividualStart.super.getP(i).tillStringTwo());
			
		}
	}
	public void convert() {
		String test = "";
		
		for( int i = 0; i < IndividualStart.super.getParticipants(); i++ ) {
			for(int j = 0; j <= 4; j++) {
				int hour = (int)IndividualStart.super.getP(i).getMellantider(j) / 3600;
				int	min = (int)(IndividualStart.super.getP(i).getMellantider(j) - (hour*3600)) / 60 ;
				int sec = (int)IndividualStart.super.getP(i).getMellantider(j) % 60;
				double decimaler = (double)IndividualStart.super.getP(i).getMellantider(j)*100;	
				int deciii = (int)IndividualStart.super.getP(i).getMellantider(j)*100;
				int deci = (int)decimaler - deciii;
				test = String.format("%02d:%02d:%02d:%02d", hour, min, sec, deci);
			
				IndividualStart.super.getP(i).setRes(j, test);
			}
			
		}
		
		
		
	}
		

}
