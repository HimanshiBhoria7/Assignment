package com.weeklyassessment;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ScoreCard {
	private static final int Integer = 0;

	public static void main(String args[]) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Rahane", 20);
		map.put("Rahul", 30);
		map.put("Kohli", 150);
		map.put("Dhoni", 50);
		map.put("Lokesh", 2);

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			// Getting keys of the record
			System.out.println("Players who batted " + m.getKey());
		}

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			// Getting values of the record
			System.out.println("Scores by Players : " + m.getValue());
		}

		int sum = 0;
		for (int i : map.values()) {
			sum = sum + i;
		}
		// Total Score
		System.out.println("Total Score " + sum);

		// Highest Score Name
		System.out.println("Name of Highest Scorer :"
				+ Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey());

		// Run scored by Particular Candidate
		String key = "Dhoni";
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getKey() == key) {
				System.out.println("Runs Scored By " + key + ":" + entry.getValue());
				break;
			}
		}
	}
}
