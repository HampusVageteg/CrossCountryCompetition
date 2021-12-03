package com.grupp6a.compare;

import java.util.Comparator;

import com.grupp6a.competitor.Person;


// Class f�r sortering av objekt array baserat p� objektens "mellantider"
public class CompareTwo implements Comparator<Person> {

	public int compare(Person p1, Person p2) {

		if (p1.getMellantider(0) < p2.getMellantider(0)) {
			return -1;
		} else if (p1.getMellantider(0) > p2.getMellantider(0)) {
			return 1;
		} else {
			return 0;
		}

	}

}