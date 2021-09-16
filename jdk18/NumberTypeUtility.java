package com.jdk18;


@FunctionalInterface
interface NumberType{
	public boolean checkNumberType(int number);	
}

public class NumberTypeUtility implements NumberType {

	@Override
	public boolean checkNumberType(int number) {
		if(number % 2 == 0) {
			System.out.println("Even");
			return true;
		}
		else {
			System.out.println("Odd");
			return false;
		}
	}
	public static void main(String args[]) {
		NumberTypeUtility nu = new NumberTypeUtility();
		nu.checkNumberType(8);
	}

}
