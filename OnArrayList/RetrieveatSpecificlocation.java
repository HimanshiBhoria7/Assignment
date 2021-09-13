package com.OnArrayList;
import java.util.ArrayList;
import java.util.List;

public class RetrieveatSpecificlocation {
	public static void main(String args[]) {
		List<String> array1 = new ArrayList<String>();
		array1.add("Ram");
		array1.add("Shyam");
		array1.add(0,"Himanshi");
		
		//retrieve an element (at a specified index) from a given array list
		System.out.println("Desired element is : "+array1.get(1));	
	}

}
