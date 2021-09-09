package com.assignmenton8sept;

abstract class A{
	abstract void get();
}
class B extends A{
	void get(){
		System.out.println("Calling from B");
	}
}

class AbstractClass{
	public static void main(String args[]) {
		A a = new B();
		a.get();		
	}
}

