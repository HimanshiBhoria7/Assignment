package com.stringdemo;

public class Split {
	public static void main(String args[]) {
		String name = "Today we are having our java Class";
		String[] name1 = name.split("\\s");
		for(String w:name1){  
			System.out.println(w);  
			}  
	}

}
