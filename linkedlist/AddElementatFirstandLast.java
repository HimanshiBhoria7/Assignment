package com.linkedlist;
import java.util.LinkedList;

public class AddElementatFirstandLast {
	public static void main(String args[]) {
		LinkedList<String> schoollist = new LinkedList<String>();
		schoollist.add("Rohan");
		schoollist.add("Sita");
		schoollist.add("Raman");
		schoollist.addFirst("Subham");
		schoollist.addLast("Gourav");
		System.out.println("Elements are : "+schoollist);
	}

}
