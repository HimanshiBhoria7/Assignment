package com.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsettoTreeset {
	public static void main(String args[]) {
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("Himanshi");
		hash1.add("Komal");
		hash1.add("Jatin");
		
		System.out.println(hash1);
		
		Set<String> treeset = new TreeSet<String>(hash1);
		
		for(String temp : treeset) {
			System.out.println("Elements are in Tree Set : "+temp);
			}
		}
	

}
