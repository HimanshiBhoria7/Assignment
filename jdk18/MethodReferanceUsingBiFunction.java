package com.jdk18;
import java.util.function.BiFunction;

class Math{
	public static int addition(int a,int b) {
		return a+b;
	}
	public static float addition(float a,float b) { //overriding 
		return a-b;
	}
	
}


public class MethodReferanceUsingBiFunction {
	public static void main(String args[]) {
		BiFunction<Integer,Integer,Integer>adder = Math::addition;
		BiFunction<Float,Float,Float>adder1 = Math::addition;
		int result = adder.apply(6,9);
		float result1 = adder1.apply(20.8f, 11.3f);
		System.out.println(result);
		System.out.println(result1);
		
	}
	

}
