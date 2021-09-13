package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateatSpecificLocation {
	public static void main(String args[]) {
		LinkedList<String> schoollist = new LinkedList<String>();
		schoollist.add("Rohan");
		schoollist.add("Sita");
		schoollist.add("Raman");
		
		Iterator it = schoollist.listIterator(1);
		while(it.hasNext()) {
			System.out.println("Elements are :"+it.next());
		}
	}

}
