package com.grupp6a.competitor;

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
		this.startNum = startNum;
		
		if (gender == 'M') {
			this.speed = 5 + rand.nextDouble() * 2;
		} else {
			this.speed = 5 + rand.nextDouble();
		}

	}

	public void race(int distance, int intervals) {

		double distanceBetweenIntervals;
		double timeToInterval;
		
		for(int i = 0; i < intervals; i++) {
			distanceBetweenIntervals = (distance * 1000) / intervals;
			timeToInterval = distanceBetweenIntervals / this.speed;
			mellantider[i] = timeToInterval;
			randomizeSpeed(this.gender);
		}
		
		
		
//		double distanceBetweenIntervals = (distance * 1000) / intervals;
//
//		double timeToInterval = distanceBetweenIntervals / this.speed;
//		
//		randomizeSpeed(this.gender);
//		return timeToInterval;
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
		return "Sekunder till mellantiderna " + mellantider[0] +  " " + mellantider[1] + " " + mellantider[2] + " " + mellantider[3] + " " + mellantider[4];
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
