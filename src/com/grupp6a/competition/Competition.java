package com.grupp6a.competition;

import com.grupp6a.competitor.Person;

// Huvudklass för de olika tävlingsformaten.
public class Competition {

	protected int participants;
	protected char gender;
	protected int distance;
	protected int intervals = 5;
	protected double coach;
	Person[] p;

	// Default constructor
	public Competition() {

	}

	public Competition(int participants, char gender, int distance, double coach) {
		super();
		this.participants = participants;
		this.gender = gender;
		this.distance = distance;
		this.coach = coach;

	}

	// Fyller upp objektarrayen med personobjekt, baserat på hur många participants
	// är med.
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

	public double getCoach() {
		return coach;
	}

	public void setCoach(double coach) {
		this.coach = coach;
	}

}
