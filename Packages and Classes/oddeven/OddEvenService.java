package com.oddeven;

public class OddEvenService {
	public String showOddEven(int num1) {
		if(num1 % 2 == 0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	
	
}
