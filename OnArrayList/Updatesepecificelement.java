package com.OnArrayList;
import java.util.List;
import java.util.ArrayList;

public class Updatesepecificelement {
	public static void main(String args[]) {
		List<String> array1 = new ArrayList<String>();
		array1.add("Ram");
		array1.add("Shyam");
		array1.add(0, "Himanshi");
		
		System.out.println(array1);
		
		//Update the Array List
		array1.set(0,"Himanshi Bhoria");
		System.out.println(array1);
		
		
		
	}
}
