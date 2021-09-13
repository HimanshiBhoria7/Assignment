package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertHashTreeintoArrayList {
	public static void main(String args[]) {
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("Himanshi");
		hash1.add("Komal");
		hash1.add("Jatin");
		System.out.println(hash1);

		ArrayList<String> array1 = new ArrayList<String>(hash1);
		for (String array : array1) {
			System.out.println("Elements are : " + array);
		}
	}

}
