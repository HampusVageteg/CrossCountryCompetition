package com.grupp6a.competitor;

public class Competitor extends Person implements Comparable<Competitor> {

	private int startTid;
	private int startNum;
	private int placement;
	private double speed;
	private double mellantider[] = new double[2];
	private String res[] = new String[2];
	private String clock[] = new String[2];

	public Competitor(char gender) {
		super(gender);
		setGender(gender);
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

	public double getSpeed() {
		return speed;
	}

	public double getMellantider(int i) {
		return mellantider[i];
	}

	public void setMellantider(int i, double u) {
		this.mellantider[i] = u;
	}

	public int getStartTid() {
		return startTid;
	}

	public void setStartTid(int startTid) {
		this.startTid = startTid;
	}

	public int getPlacement() {
		return placement;
	}

	public void setPlacement(int placement) {
		this.placement = placement;
	}

	public void setRes(int i, String x) {
		this.res[i] = x;
	}

	public String getClock(int i) {
		return clock[i];
	}

	public double[] getMellantider() {
		return mellantider;
	}

	public void setClock(int i, String x) {
		this.getClock()[i] = x;
	}

	public String[] getClock() {
		return clock;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public String toString() {
		return getFullName() + "\t" + "\t" + "\t" + placement + "\t" + "\t" + "\t" + startNum + "\t" + "\t" + "\t"
				+ res[0] + "\t" + "\t" + res[1] + "\t" + "\t" + getClock()[1];
	}

	public String infoAtInterval(int i) {
		// Skriver ut formaterade mellantiden på arrayplats i
		return placement + "\t" + "\t" + startNum + "\t" + "\t" + res[i] + "\t" + "\t" + getClock()[i];

	}

	// Formatterar om angivet antal sekunder till minuter timmar sekunder 
	public String converter(double time) {

		String format = "";

		int HH = (int) time / 3600;
		int MM = (int) (time - (HH * 3600)) / 60;
		int SS = (int) time % 60;
		double x = (double) time * 100;
		int y = (int) time * 100;
		int MS = (int) x - y;
		format = String.format("%02d:%02d:%02d:%02d", HH, MM, SS, MS);
		return format;
	}

	// Skapar en metod för att jämföra totaltid.
	@Override
	public int compareTo(Competitor o) {
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
