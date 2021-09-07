package com.classobject;

class AdditionOfNumbers{
	void showResults() {
		int a = 10;
		int b = 15;
		int c = a + b;
		System.out.println(c);
	}
}

public class ClassDemo {
	public static void main(String args[]) {
	AdditionOfNumbers additionOfNumbers = new AdditionOfNumbers();
	additionOfNumbers.showResults();	
	}	
}
