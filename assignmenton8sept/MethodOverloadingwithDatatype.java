package com.assignmenton8sept;

class Sum2{
	static int add(int num1,int num2) {
		return num1+num2 ;	
	}
	
	static double add(double num1,double num2) {
		return num1+num2 ;	
	}
}

class MethodOverloadingwithDatatype {
	public static void main(String args[]) {
		System.out.println(Sum2.add(11,6));
		System.out.println(Sum2.add(11.3,2.6));
		
	}
	
	

}
