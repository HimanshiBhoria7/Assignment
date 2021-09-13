package com.OnArrayList;
import java.util.List;
import java.util.ArrayList;

public class SearchElement {
	public static void main(String args[]) {
		List<String> array1 = new ArrayList<String>();
		array1.add("Ram");
		array1.add("Shyam");
		array1.add(0,"Himanshi");
		
		//Search that element is present or not
		if(array1.contains("Himanshi")){
			System.out.println("Found");
		}
		else {
			System.out.println("Element not present");
		}
	}

}
