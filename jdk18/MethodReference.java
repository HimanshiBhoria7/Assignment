package com.jdk18;

interface Bird{
	void call();
}


public class MethodReference {
	public static void check() {
		System.out.println("This msg is from Method Reference");
	}
	public static void main(String args[]) {
		Bird b = MethodReference :: check;
		b.call();
		
	}
	

}
