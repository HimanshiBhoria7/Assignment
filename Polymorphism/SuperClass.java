package com.Polymorphism;

class Super1{
		String name = "Ram";
}
class Super2 extends Super1{
	String name = "Sham";
	void food(){
		System.out.println(name);
		System.out.println(super.name);
	}
}
class SuperClass {
	public static void main(String args[]) {
		Super2 s = new Super2();
		s.food();
	}
}
