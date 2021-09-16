package com.lambdaexpression;

interface Palindrome{
	int ispalidrome(int a);
}
public class LambdaExpressionwithPalindrome {
	public static void main(String args[]) {
		Palindrome p1 = (n) -> {
			int rem,sum = 0;
			int temp = n;
			while(n>0) {
				rem = n % 10;
				sum = (sum*10)+rem;
				temp = n/10;				
			}
			return sum; };
			int sum1 , n1 = 464;
		    sum1 = p1.ispalidrome(n1);
			if(n1 == sum1) {
				System.out.println("Palindrome Number : "+n1);
			}
			else {
				System.out.println("Not Palindrome");
			}
		}
}
