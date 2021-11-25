package com.grupp6a.competitor;

public class Person {

	private String gender;
	private String name;
	private int age;
	private int startNum;
	private int lastResult;
	private double speed;

	public Person(String gender, String name, int age, int startNum, int lastResult, double speed) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.startNum = startNum;
		this.lastResult = lastResult;
		this.speed = speed;
	}

	public double race(int distance, int intervals) {
		
		double distanceBetweenIntervals = (distance *1000) / intervals;
		
		double timeToInterval = distanceBetweenIntervals / this.speed;
		
		return timeToInterval;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
