package com.grupp6a.competition;

import com.grupp6a.competitor.Person;

// Huvudklass f�r de olika t�vlingsformaten.
public class Competition {

	protected int participants;
	protected char gender;
	protected int distance;
	protected int intervals = 5;
	Person[] p;
	

	// Default constructor
	public Competition() {

	}

	public Competition(int participants, char gender, int distance) {
		super();
		this.participants = participants;
		this.gender = gender;
		this.distance = distance;
		
	}

	// Fyller upp objektarrayen med personobjekt, baserat p� hur m�nga participants
	// �r med.
	public void fillArray(int participants) {

		for (int i = 0; i < participants; i++) {
			p[i] = new Person(gender, i);
		}

	}
	

	
	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getDistance() {
		return distance;
	}

	public int getIntervals() {
		return intervals;
	}

	public Person getP(int i) {
		return p[i];
	}

	public void setP(Person[] p) {
		this.p = p;
	}

	public Person[] getP() {
		return p;
	}

}
