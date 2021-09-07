package com.classobject;

class Student{
	void showResult() {
		String name = "John";
		int roll_no = 2;
		System.out.println(name);
		System.out.println(roll_no);
	}
}

public class StudentRollNo {
	public static void main(String args[]) {
		Student student = new Student();
		student.showResult();
	}
}
	