package com.linkedlist;
import java.util.LinkedList;
import java.util.Iterator;

public class AllElementsinLinkedList {
	public static void main(String args[]) {
		LinkedList<String> schoollist = new LinkedList<String>();
		schoollist.add("Rohan");
		schoollist.add("Sita");
		schoollist.add("Raman");
		
		Iterator it = schoollist.iterator();
		while(it.hasNext()) {
			System.out.println("Elements are :"+it.next());
		}
	}

	

}
