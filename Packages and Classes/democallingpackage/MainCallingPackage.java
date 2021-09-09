package com.democallingpackage;

import com.addition.AdditionService;
import com.division.DivisionService;
import com.multiplicatiion.MultiplicationService;
import com.oddeven.OddEvenService;
import com.subtraction.SubtractionService;

public class MainCallingPackage {
	
	public static void main(String args[]) {
		AdditionService additionService = new AdditionService();
		SubtractionService subtractionService = new SubtractionService();
		MultiplicationService multiplicationService = new MultiplicationService();
		DivisionService divisionService = new DivisionService();
		OddEvenService oddEvenService = new OddEvenService();
		
		int result = additionService.showAddition(6, 7);
		System.out.println("addition "+result);
		
		int result1 = subtractionService.showSub(7, 2);
		System.out.println("subtraction "+result1);
		
		int result3 = multiplicationService.showMulti(7, 10);
		System.out.println("Multiply "+result3);
		
		int result4 = divisionService.showDivision(25, 5);
		System.out.println("Division is "+result4);
		
		String result5 = oddEvenService.showOddEven(8);
		System.out.println("The number is "+result5);
		
		
		
	}
		
	

		
	}
	