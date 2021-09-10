package com.assignmenton8sept;

interface Sum{
	public void sum();
}

interface Add extends Sum{
	public void add();
}

class A11 implements Add{

	@Override
	public void sum() {
		System.out.println("Sum Interface");
	}

	@Override
	public void add() {
		System.out.println("Add Interface");
	}
}

public class Interface{
	public static void main(String args[]) {
		Sum m = new A11();
		m.sum();
	}
}


