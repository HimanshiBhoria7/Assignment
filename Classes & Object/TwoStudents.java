package com.classobject;

class Student1{
	void showResultOfSam() {
		String name = "Sam";
		int phone_no = 1234567890;
		int roll_no = 2;
		String address = "123 Mumbai";
		System.out.println("Details of 1st are "+name + phone_no + roll_no + address);
	}
	
	void showResultOfJohn() {
		String name = "John";
		int phone_no = 987654321;
		int roll_no = 3;
		String address = "Gurgaon V.k";
		System.out.println("Details of 2nd are "+name + phone_no + roll_no + address);
	}
}

public class TwoStudents {
	public static void main(String args[]) {
		Student1 student = new Student1();
		student.showResultOfSam();
		student.showResultOfJohn();
	}
}
