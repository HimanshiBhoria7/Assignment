package com.stringdemo;

public class EqualIgnoreCase {
	public static void main(String args[]) {
		String name = "Today we are having our java Class";
		String name1 = "Himanshi Bhoria";
		String name2 = "Himanshi Bhoria";
		
		System.out.println(name.equalsIgnoreCase(name1)); //false
		System.out.println(name1.equalsIgnoreCase(name2)); //true
	}

}
