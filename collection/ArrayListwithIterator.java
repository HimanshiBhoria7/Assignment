package com.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListwithIterator {
	public static void main(String args[]) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Ram");
		arraylist.add("Sham");
		arraylist.add("Mohan");
		
		Iterator iterator = arraylist.iterator();
		while(iterator.hasNext()) {
			System.out.println("Result of Array List with Iterator :"+iterator.next());
		}
	}
	

}
