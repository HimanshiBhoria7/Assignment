package com.classobject;
import java.util.Scanner;  

class Numbers{
	
	int average;
	void averageNumber(int number1,int number2,int number3){
		average = (number1 + number2 + number3)/3;		
	}
	int getAverage() {
		return average;
	}
}


public class Average {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ");
		int number1 = sc.nextInt();
		System.out.println("Enter Second Number ");
		int number2 = sc.nextInt();
		System.out.println("Enter Third Number ");
		int number3 = sc.nextInt();

		Numbers numbers = new Numbers();
		numbers.averageNumber(number1, number2, number3);
		int temp = numbers.getAverage();
		System.out.println("Average is : "+temp);
	}
}
