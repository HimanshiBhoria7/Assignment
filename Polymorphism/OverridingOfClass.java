package com.Polymorphism;

class Class{
	void draw() {
		System.out.println("Draw Method");
	}
	void erase() {
		System.out.println("Erase Method");
	}
}
class Circle extends Class{
	void draw() {
		System.out.println("Draw Method");
	}
	void erase() {
		System.out.println("Erase Method");
	}
	
}
class Triangle extends Class{
	void draw() {
		System.out.println("Draw Method");
	}
	void erase() {
		System.out.println("Erase Method");
	}	
}
class Square extends Class{
	void draw() {
		System.out.println("Draw Method");
	}
	void erase() {
		System.out.println("Erase Method");
	}	
}
class OverridingOfClass {
	public static void main(String args[]) {
		Class s = new Square(); //square
		s.draw();
		s.erase();
		
		Class t = new Triangle(); //triangle
		t.draw();
		t.erase();
		
		Class c = new Circle(); //circle
		t.draw();
		t.erase();
	}
}
