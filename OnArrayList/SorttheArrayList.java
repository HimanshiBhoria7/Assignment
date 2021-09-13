package com.OnArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SorttheArrayList {
	public static void main(String args[]) {
		List<String> array1 = new ArrayList<String>();
		array1.add("Ram");
		array1.add("Shyam");
		array1.add("Himanshi");
		array1.add("Aman");
		
		System.out.println(array1);
		//Sorting of array list
		Collections.sort(array1);
		System.out.println(array1);
		
	}

}
