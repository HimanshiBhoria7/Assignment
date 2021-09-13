package com.linkedlist;
import java.util.LinkedList;


public class AppendElementatSpecificLocation {
	public static void main(String args[]) {
		LinkedList<String> schoollist = new LinkedList<String>();
		schoollist.add("Rohan");
		schoollist.add("Sita");
		schoollist.add(0,"Raman");
		
		System.out.println(schoollist);
	}

}
