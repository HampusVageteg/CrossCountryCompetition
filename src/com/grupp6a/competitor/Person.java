package com.grupp6a.competitor;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

// Klass för deltagare.
public class Person {

	List<String> mfname = Arrays
			.asList(new String[] { "Lars", "Sven", "Björn", "Johan", "Erik", "Per", "Peter", "Karl", "David", "Jan" });
	List<String> ffname = Arrays
			.asList(new String[] { "Anna", "Eva", "Maria", "Karin", "Sara", "Fia", "Lena", "Emma", "Pia", "Marie" });
	List<String> lastname = Arrays.asList(new String[] { "Andersson", "Johansson", "Karlsson", "Nilsson", "Eriksson",
			"Larsson", "Olsson", "Persson", "Svensson", "Knutsson" });

	private char gender = 'M';
	private String fname;
	private String lname;
	private String fullName;

	// Använder för att slumpa namn
	Random rand = new Random();

	public Person(char gender) {
		this.gender = gender;

		// Slumpar deltagarnas namn utifrån arraylistorna
		if (gender == 'M') {
			fname = mfname.get(rand.nextInt(10));
		} else {
			fname = ffname.get(rand.nextInt(10));
		}
		lname = lastname.get(rand.nextInt(10));
		fullName = fname + " " + lname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getFname() {
		return fname;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
