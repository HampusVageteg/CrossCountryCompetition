package com.grupp6a.compare;

import java.util.Comparator;

import com.grupp6a.competitor.Competitor;

// Class för sortering av objekt array baserat på objektens "mellantiden"
public class ContestantIntervalComparator implements Comparator<Competitor> {

	public int compare(Competitor p1, Competitor p2) {

		if (p1.getMellantider(0) < p2.getMellantider(0)) {
			return -1;
		} else if (p1.getMellantider(0) > p2.getMellantider(0)) {
			return 1;
		} else {
			return 0;
		}

	}

}