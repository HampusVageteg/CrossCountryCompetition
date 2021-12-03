package com.grupp6a.competitor;

import java.util.Random;

// Huvudklass för deltagare.
public class Person implements Comparable<Person> {

	private char gender = 'M';
	private int startNum;
	private int placement;
	private double speed;
	private int startTid = 36000;
	private double totTid[] = new double[2];
	private double mellantider[] = new double[2];
	private String res[] = new String[5];

	Random rand = new Random();

	public Person(char gender, int startNum) {
		super();
		this.gender = gender;
		this.startNum = startNum + 1;
		this.startTid = startTid + (15 * this.startNum);

		// Sätter slumpmässig hastighet mellan 5-7 beroende på kön.
		if (gender == 'M') {
			this.speed = 5 + rand.nextDouble() * 2;
		} else {
			this.speed = 5 + rand.nextDouble();
		}

	}

	// Metod för att simulera ett race. Tar in angiven distans och antal
	// intervaller.
	public void race(int distance, double coach) {

		double distanceToCoach;
		double timeToCoach = 0;
		double distanceToFinish;
		double timeToFinish;

		distanceToCoach = (coach * 1000);
		timeToCoach = distanceToCoach / this.speed;
		mellantider[0] = Math.round(timeToCoach * 100.0) / 100.0;
		randomizeSpeed(this.gender);
		distanceToFinish = (distance * 1000) - distanceToCoach;
		timeToFinish = distanceToFinish / this.speed;
		mellantider[1] = (Math.round(timeToFinish * 100.0) / 100.0) + mellantider[0];
		totTid[0] = startTid + mellantider[0];
		totTid[1] = startTid + mellantider[1];

	}

	// Metod för att slumpa hastighet beroende på kön.
	public void randomizeSpeed(char gender) {

		if (gender == 'M') {
			this.speed = 5 + rand.nextDouble() * 2;
		} else {
			this.speed = 5 + rand.nextDouble();
		}

	}

	public String toString() {
		return placement + "\t" + "\t" + startNum + "\t" + "\t" + res[0] + "\t" + "\t" + res[1] + "\t" + totTid[0] +  "\t" + totTid[1];
	}

	public String toString(int i) {

		return placement + "\t" + "\t" + startNum + "\t" + "\t" + res[i];

	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getPlacement() {
		return placement;
	}

	public void setPlacement(int placement) {
		this.placement = placement;
	}

	public double getMellantider(int i) {
		return mellantider[i];
	}

	public void setMellantider(double[] mellantider) {
		this.mellantider = mellantider;
	}

	public String getRes(int i) {
		return res[i];
	}

	public void setRes(int i, String x) {
		this.res[i] = x;
	}

	public int getStartTid() {
		return startTid;
	}

	public void setStartTid(int startTid) {
		this.startTid = startTid;
	}

	public double getTotTid(int i) {
		return totTid[i];
	}

	public void setTotTid(double[] totTid) {
		this.totTid = totTid;
	}

	// Skapar en metod för att jämföra totaltid.
	@Override
	public int compareTo(Person o) {
		int i;
		if (o.mellantider[1] == this.mellantider[1]) {
			i = 0;
		} else if (o.mellantider[1] < this.mellantider[1]) {
			i = 1;
		} else {
			i = -1;
		}

		return i;
	}

}
