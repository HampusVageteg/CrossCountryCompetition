package com.grupp6a.competition;

import com.grupp6a.competitor.Competitor;

// Huvudklass för de olika tävlingsformaten.
public class Competition {

	private int participants;
	private char gender;
	private int distance;
	private double coach;
	private int startTime;
	private Competitor p[];

	// Default constructor
	public Competition() {

	}

	public Competition(int participants, char gender, int distance, double coach, int startTime) {
		super();
		this.participants = participants;
		this.gender = gender;
		this.distance = distance;
		this.coach = coach;
		this.startTime = startTime;

	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
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

	public Competitor getP(int i) {
		return p[i];
	}

	public void setP(Competitor[] p) {
		this.p = p;
	}

	public Competitor[] getP() {
		return p;
	}

	public double getCoach() {
		return coach;
	}

	public void setCoach(double coach) {
		this.coach = coach;
	}

	// Tar ett startnummer och loopar igenom alla deltagare.
	// Gör det för att hitta objektet med motsvarande startnummer och returnerar
	// objektet.
	public Competitor getParticipant(int startNum) {
		for (int i = 0; i < p.length; i++)
			if (p[i].getStartNum() == startNum) {
				return p[i];
			}
		return p[0];

	}

}
