package com.grupp6a.competition;

public class Competition {

	private int participants;
	private String gender;
	private int distance;
	private int intervals = 5;
	
	
	
	public Competition(int participants, String gender, int distance) {
		super();
		this.participants = participants;
		this.gender = gender;
		this.distance = distance;
		
	}
	
	public int getParticipants() {
		return participants;
	}
	
	public void setParticipants(int participants) {
		this.participants = participants;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
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
	
	
	
	
	}
