package com.lambdaexpression;

interface Rectangle{
	public void check();
}

public class WithoutLambdaFunction {
	public static void main(String args[]) {
		int area = 10;
	    Rectangle rectangle = new Rectangle(){
	    	public void check() {
	    		System.out.println("Width is : "+area);
	    	}
	    };
	    rectangle.check();	
	}
}
