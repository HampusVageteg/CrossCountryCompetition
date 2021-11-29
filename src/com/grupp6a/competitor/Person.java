package com.grupp6a.competitor;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class Person {

	private char gender;
	private int startNum;
	private int lastResult;
	private double speed;
	private double mellantider[] = new double[5];

	Random rand = new Random();

	public Person(char gender, int startNum) {
		super();
		this.gender = gender;
		this.startNum = startNum + 1;

		if (gender == 'M') {
			this.speed = 5 + rand.nextDouble() * 2;
		} else {
			this.speed = 5 + rand.nextDouble();
		}

	}

	public void race(int distance, int intervals) {

		double distanceBetweenIntervals;
		double timeToInterval;
		double convertToMin;

		for (int i = 0; i < intervals; i++) {
			distanceBetweenIntervals = (distance * 1000) / intervals;
			timeToInterval = distanceBetweenIntervals / this.speed;
			convertToMin = timeToInterval / 60;
			mellantider[i] = Math.round(convertToMin * 100.0) / 100.0;
			randomizeSpeed(this.gender);

		}

	}

	public void randomizeSpeed(char gender) {

		if (gender == 'M') {
			this.speed = 5 + rand.nextDouble() * 2;
		} else {
			this.speed = 5 + rand.nextDouble();
		}

	}

	@Override
	public String toString() {
		return "\nStartnumber: " + startNum + "\nMinuter till mellantid\n" + "1. " + mellantider[0] + "\n" + "2. "
				+ mellantider[1] + "\n" + "3. " + mellantider[2] + "\n" + "4. " + mellantider[3] + "\n" + "5. "
				+ mellantider[4] + "\n";
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

}
