package com.hashset;

import java.util.HashSet;

public class CloningHashsetintoAnother {
	public static void main(String args[]) {
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("Himanshi");
		hash1.add("Komal");
		hash1.add("Jatin");
		System.out.println(hash1);
		
		//New HashSet
		HashSet<String> hash2 = new HashSet<String>();
		hash2 = (HashSet<String>) hash1.clone();
		System.out.println(hash2);
	}
	

}
