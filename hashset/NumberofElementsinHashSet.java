package com.hashset;

import java.util.HashSet;

public class NumberofElementsinHashSet {
	public static void main(String args[]) {
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("Himanshi");
		hash1.add("Komal");
		hash1.add("Jatin");
		System.out.println("Size of HashSet is : "+hash1.size());
	}
}
