package com.grupp6a.compare;

import java.util.Comparator;

import com.grupp6a.competitor.Competitor;

//Klass f�r sortering av objekt array baserat p� objektens "total tid" fram till f�rsta mellantiden.
public class TotalTimeToIntervalComparator implements Comparator<Competitor> {

	public int compare(Competitor p1, Competitor p2) {

		if ((p1.getStartTid() + p1.getMellantider(0)) < (p2.getStartTid() + p2.getMellantider(0))) {
			return -1;
		} else if ((p1.getStartTid() + p1.getMellantider(0)) > (p2.getStartTid() + p2.getMellantider(0))) {
			return 1;
		} else {
			return 0;
		}

	}

}
