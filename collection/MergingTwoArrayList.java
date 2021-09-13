package com.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class MergingTwoArrayList {
	public static void main(String args[]) {
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("Ram");
		array1.add("Sham");
		
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("Rohan");
		array2.add("Ranjan");
		
		array2.addAll(array1); //Merging array
		
		Iterator iterator = array2.iterator();
		while(iterator.hasNext()) {
			System.out.println("Result of Merging Array is : "+iterator.next());
		}
		
		
		
	}

}
