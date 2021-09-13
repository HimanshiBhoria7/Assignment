package com.OnArrayList;
import java.util.ArrayList;
import java.util.List;

public class Insetelementatfirstposition {
	public static void main(String args[]) {
		List<String> array1 = new ArrayList<String>();
		array1.add("Ram");
		array1.add("Shyam");
		array1.add(0,"Himanshi");
		
		for(String listname : array1) {
			System.out.println("Result is : "+listname);
		}
		
	}
	

}
