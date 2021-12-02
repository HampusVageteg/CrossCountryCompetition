package com.grupp6a.competitor;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Comparator;
import java.util.Random;

// Huvudklass för deltagare.
public class Person implements Comparable<Person> {

	private char gender = 'M';
	private int startNum;
	private int lastResult;
	private double speed;
	private double mellantider[] = new double[5];
	private String res[] = new String[5];
	private int placement;

	Random rand = new Random();

	public Person(char gender, int startNum) {
		super();
		this.gender = gender;
		this.startNum = startNum + 1;

		// Sätter slumpmässig hastighet mellan 5-7 beroende på kön.
		if (gender == 'M') {
			this.speed = 5 + rand.nextDouble() * 2;
		} else {
			this.speed = 5 + rand.nextDouble();
		}

	}

	// Metod för att simulera ett race. Tar in angiven distans och antal
	// intervaller.
	public void race(int distance, int intervals) {

		double distanceBetweenIntervals;
		double timeToInterval = 0;

		// Räknar ut avstånden mellan intervallerna.
		// Räknar därefter ut tiden det tar att åka mellan intervallerna, baserat på den
		// slumpade hastigheten.
		// Tiden lagras i en array.
		// Hastigheten slumpas efter varje ny mellantid.
		for (int i = 0; i < intervals; i++) {
			distanceBetweenIntervals = (distance * 1000) / intervals;
			timeToInterval += distanceBetweenIntervals / this.speed;
			mellantider[i] = Math.round(timeToInterval * 100.0) / 100.0;
			randomizeSpeed(this.gender);

		}

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
		return placement + "\t" + "\t" + startNum + "\t" + "\t" + res[0] + "\t" + "\t" + res[1] + "\t" + "\t" + res[2]
				+ "\t" + "\t" + res[3] + "\t" + "\t" + res[4];
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

	public int getLastResult() {
		return lastResult;
	}

	public void setLastResult(int lastResult) {
		this.lastResult = lastResult;
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

	public String[] getRes() {
		return res;
	}

	public void setRes(int i, String x) {
		this.res[i] = x;
	}

	// Skapar en metod för att jämföra totaltid.
	@Override
	public int compareTo(Person o) {
		int i;
		if (o.mellantider[4] == this.mellantider[4]) {
			i = 0;
		} else if (o.mellantider[4] < this.mellantider[4]) {
			i = 1;
		} else {
			i = -1;
		}

		return i;
	}
	
	
}
