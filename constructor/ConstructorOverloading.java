package com.constructor;

public class ConstructorOverloading {
	String fname;
	String mname;
	String lname;
	
	ConstructorOverloading(String f,String l){ 
		fname = f;
		lname = l;
	}
	
	ConstructorOverloading(String f,String m,String l){ 
		fname = f;
		mname = m;
		lname = l;
	}

	void result() { //overloading constructor
		System.out.println("The name of person is : "+fname+ " " + mname + " " + lname);
	}
	
	public static void main(String args[]) {
		ConstructorOverloading p1 = new ConstructorOverloading("Himanshi","Bhoria");
		ConstructorOverloading p2 = new ConstructorOverloading("Ram","Kumar","Anand");
		p1.result();
		p2.result();
	}
}


