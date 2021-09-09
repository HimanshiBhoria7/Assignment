package com.assignmenton8sept;

class Sum1{
	static int add(int num1,int num2) {
		return num1+num2 ;	
	}
	
	static int add(int num1,int num2 ,int num3) {
		return num1+num2+num3 ;	
	}
}

class MethodOverloadingWithParameter {
	public static void main(String args[]) {
		System.out.println(Sum1.add(5,8));
		System.out.println(Sum1.add(8,4,6));
	}

}
