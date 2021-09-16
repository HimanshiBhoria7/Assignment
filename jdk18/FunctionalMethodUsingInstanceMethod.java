package com.jdk18;

interface Bike{
	void call();
}

public class FunctionalMethodUsingInstanceMethod {
	public void check() {
		System.out.println("This msg is from Instance Method");
	}
	public static void main(String args[]) {
		FunctionalMethodUsingInstanceMethod fmi = new FunctionalMethodUsingInstanceMethod();
		Bike b = fmi::check;
		b.call();
		Bike b2 = new FunctionalMethodUsingInstanceMethod() :: check;
		b2.call();
	}
}
