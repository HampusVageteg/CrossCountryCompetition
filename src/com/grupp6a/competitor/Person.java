package com.grupp6a.competitor;

import java.util.Random;

public class Person {

	private char gender;
	private int startNum;
	private int lastResult;
	private double speed;

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

	public double race(int distance, int intervals) {

		double distanceBetweenIntervals = (distance * 1000) / intervals;

		double timeToInterval = distanceBetweenIntervals / this.speed;

		return timeToInterval;
	}

	@Override
	public String toString() {
		return "Person speed: " + speed;
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
