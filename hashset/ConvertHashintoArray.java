package com.hashset;

import java.util.HashSet;

public class ConvertHashintoArray {
	public static void main(String args[]) {
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("Himanshi");
		hash1.add("Komal");
		hash1.add("Jatin");
		System.out.println(hash1);
		String[] array = new String[hash1.size()];
		hash1.toArray(array);		
		for(String temp : array) {
			System.out.println("Elements are :"+temp);
		}
	}

}
