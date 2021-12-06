package com.grupp6a.competitor;

import java.util.Random;

// Huvudklass för deltagare.
public class Person implements Comparable<Person> {

	private char gender = 'M';
	private int startNum;
	private int placement;
	private double speed;
	private int startTid = 1337;
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

	// Metod för att simulera racet.
	
	public void race(int distance, double coach) {

		double distanceToCoach;
		double timeToCoach = 0;
		double distanceToFinish;
		double timeToFinish;

		// Gör om distansen till coach från KM till meter
		distanceToCoach = (coach * 1000);
		// delar distansen i meter med hastigheten(Meter per sekund)
		timeToCoach = distanceToCoach / this.speed;
		// sparar tiden det tar att nå coachen i array och avrundar till 2 decimaler.
		mellantider[0] = Math.round(timeToCoach * 100.0) / 100.0;
		// Slumpar tävlandes hanstighet.
		randomizeSpeed(this.gender);
		// Räknar fram distansen som är kvar till målgång.
		distanceToFinish = (distance * 1000) - distanceToCoach;
		// Tar distansen delat i nya hastigheten för att få fram tiden.
		timeToFinish = distanceToFinish / this.speed;
		// Sparar tiden i mellantid array, avrundat till 2 decimaler.
		mellantider[1] = (Math.round(timeToFinish * 100.0) / 100.0) + mellantider[0];
		totTid[0] = startTid + mellantider[0];
		totTid[1] = startTid + mellantider[1];

	}

	// Metod för att slumpa hastighet beroende på kön.
	// Slumpar fram ett tal mellan 0-1, gångrar med två för herrarna.
	// Tävlandes bashastighet är 5 meter per sekund.
	public void randomizeSpeed(char gender) {

		if (gender == 'M') {
			this.speed = 5 + rand.nextDouble() * 2;
		} else {
			this.speed = 5 + rand.nextDouble();
		}

	}

	public String toString() {
		return placement + "\t" + "\t" + "\t" + startNum + "\t" + "\t" + "\t" + res[0] + "\t" + "\t" + res[1];
	}

	public String toString(int i) {
		// Skriver ut formaterade mellantiden på arrayplats i
		return placement + "\t" + "\t" + startNum + "\t" + "\t" + res[i];

	}

	public int getStartNum() {
		return startNum;
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

	public void setRes(int i, String x) {
		this.res[i] = x;
	}

	public int getStartTid() {
		return startTid;
	}
	
	public double getTotTid(int i) {
		return totTid[i];
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
