package com.OnArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElementinArrayList {
	public static void main(String args[]) {
		List<String> array1 = new ArrayList<String>();
		array1.add("Ram");
		array1.add("Shyam");
		array1.add("Himanshi");
		array1.add("Radha");
		array1.add("Raj");
		System.out.println(array1);
		
		//reverse
		Collections.reverse(array1);
		
		System.out.println(array1);

	}
}
