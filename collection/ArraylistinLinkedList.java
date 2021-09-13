package com.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class ArraylistinLinkedList {
	public static void main(String args[]) {
		List<String> listelement = new LinkedList<String>(); //Linked List
		listelement.add("Ram");
		listelement.add("Shyam");
		listelement.add("Rohan");
		
		ArrayList<String> arrayelement = new ArrayList<String>();
		arrayelement.add("Komal");
		arrayelement.add("Jatin");
		
		arrayelement.addAll(listelement);
		
		Iterator iterator = arrayelement.iterator();
		while(iterator.hasNext()) {
			System.out.println("List Element using Add All are : "+iterator.next());
		}
		
	}

}
