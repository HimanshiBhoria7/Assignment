package com.stringdemo;

public class EqualsTo {
	public static void main(String args[]) {
		String name = "Today we are having our java Class";
		String name1 = "Himanshi Bhoria";
		String name3 = "Himanshi Bhoria";
		System.out.println(name.equals(name1)); //false
		System.out.println(name1.equals(name3)); //true
	}

}
