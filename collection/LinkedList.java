package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedList {
	public static void main(String args[]) {
		List<String> schoollist = new ArrayList<String>();
		schoollist.add("Rohan");
		schoollist.add("Sita");
		schoollist.add("Raman");
		Iterator iterator =  schoollist.iterator();
		while(iterator.hasNext()) {
			System.out.println("List Of student in Linked list is : "+iterator.next());
		}
	}

}
