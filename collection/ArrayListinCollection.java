package com.collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListinCollection {
	public static void main(String args[]) {
		List <String> studentlist =  new ArrayList<String>();
		studentlist.add("Ram");
		studentlist.add("Ramesh");
		studentlist.add("Rohan");
		studentlist.add("John");
		//Using Enhance For Loop
		for(String listofstudent : studentlist) {
			System.out.println("List Of Students are :"+listofstudent);
		}
	}

}
