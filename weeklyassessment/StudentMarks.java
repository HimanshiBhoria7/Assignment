package com.weeklyassessment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		{
			System.out.println("Enter the Marks for 1st student : ");
			list.add(scanner.nextInt());
			System.out.println("Enter the Marks for 2nd student : ");
			list.add(scanner.nextInt());
			System.out.println("Enter the Marks for 3rd student : ");
			list.add(scanner.nextInt());
			System.out.println("Enter the Marks for 4th student : ");
			list.add(scanner.nextInt());
			System.out.println("Enter the Marks for 5th student : ");
			list.add(scanner.nextInt());
			//Showing List of Marks of Students
			System.out.println("The Marks of Students are : "+list);
			//Finding the max marks
			int max = Collections.max(list);
			System.out.println("Highest Marks Obtained By Student is : "+max);
			
			//Finding the average mark
			int total = 0;
			int avg;
			for(int i = 0; i<list.size(); i++)
			{
				total = total+list.get(i);
				
			}
			System.out.println("Total Marks obtained by Students "+total);
			System.out.println("Number of Students in the list "+list.size());
			avg = total / list.size();
			
			//Average Marks of student
			System.out.println("The Average IS:" + avg);
			
			//Displaying marks of third student
			System.out.println("Marks of 3rd Student "+list.get(3));
			
			//sorting the array 
			Collections.sort(list);
			Iterator<Integer> itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println("Sorting of Marks are : "+itr.next());
			}
		}
	
	}
}
