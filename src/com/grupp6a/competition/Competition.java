package com.grupp6a.competition;

import com.grupp6a.competitor.Person;

public class Competition {

	protected int participants;
	protected char gender;
	protected int distance;
	protected int intervals = 5;
	Person p[] = new Person[150];

	public Competition() {

	}

	public Competition(int participants, char gender, int distance) {
		super();
		this.participants = participants;
		this.gender = gender;
		this.distance = distance;

	}

	public void fillArray(int participants) {

		for (int i = 0; i < participants; i++) {
			p[i] = new Person(gender, i);
		}

	}

	public void printArray(int participants) {

		for (int i = 0; i < participants; i++) {
			System.out.println(p[i].toString());

		}

	}

	@Override
	public String toString() {
		return "Competition \nParticipants: " + participants + "\nGender: " + gender + "\nDistance: " + distance + "km";
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

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getIntervals() {
		return intervals;
	}

	public void setIntervals(int intervals) {
		this.intervals = intervals;
	}

	public Person getP(int i) {
		return p[i];
	}

	public void setP(Person[] p) {
		this.p = p;
	}

}
