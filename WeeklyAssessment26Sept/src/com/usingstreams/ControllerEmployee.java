package com.usingstreams;

import java.util.ArrayList;
import java.util.List;

public class ControllerEmployee {

	public static void main(String args[]) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Himanshi", 21, "Pune"));
		list.add(new Employee(2, "Komal", 25, "Gurgaon"));
		list.add(new Employee(3, "Jatin", 19, "Pune"));

		list.stream().filter(e -> e.getLocation() == "Pune").forEach(System.out::println);
	}

}
