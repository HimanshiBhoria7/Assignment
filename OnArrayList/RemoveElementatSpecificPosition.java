package com.OnArrayList;
import java.util.ArrayList;
import java.util.List;

public class RemoveElementatSpecificPosition {
	public static void main(String args[]) {
		List<String> array1 = new ArrayList<String>();
		array1.add("Ram");
		array1.add("Shyam");
		array1.add("Himanshi");
		array1.add("Radha");
		array1.add("Raj");
		System.out.println(array1);
		
		//remove an element (at a specified index) from a given array list
		array1.remove(3);	
		System.out.println(array1);
	}

}
