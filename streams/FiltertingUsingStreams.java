package com.streams;

import java.util.ArrayList;
import java.util.List;

class Students {
	int rollno;
	String name;

	public Students(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}

public class FiltertingUsingStreams {
	public static void main(String args[]) {
		List<Students> list = new ArrayList<Students>();
		list.add(new Students(1, "Himanshi"));
		list.add(new Students(2, "Komal"));
		list.add(new Students(3, "Jatin"));
		list.add(new Students(4, "Ram"));
		list.add(new Students(5, "Sham"));

		list.stream().filter(x -> x.rollno > 3).map(x1 -> x1.rollno).forEach(System.out::println);
	}

}
