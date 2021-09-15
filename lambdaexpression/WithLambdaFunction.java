package com.lambdaexpression;

interface Rectangle{
	public void check();
}

public class WithLambdaFunction {
	public static void main(String args[]) {
		int area = 10;
		Rectangle r =()->{
			System.out.println("Area is : "+area);
		};
		r.check();
	}

}
