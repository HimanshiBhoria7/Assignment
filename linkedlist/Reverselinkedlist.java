package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Reverselinkedlist {
	public static void main(String args[]) {
		LinkedList<String> schoollist = new LinkedList<String>();
		schoollist.add("Rohan");
		schoollist.add("Sita");
		schoollist.add("Raman");
		System.out.println("Elements are :"+schoollist);
		Collections.reverse(schoollist);
		System.out.println(schoollist);
	}

}
