package com.constructor;

public class ParameterizeConstructor {
	String fname;
	String mname;
	String lname;
	
	ParameterizeConstructor(String f,String m,String l){ 
		fname = f;
		mname = m;
		lname = l;
	}
	void result() { //parameterize constructor
		System.out.println("The name of person is : "+fname+ " " + mname + " " + lname);
	}
	public static void main(String args[]) {
		ParameterizeConstructor p = new ParameterizeConstructor("Ram","Kumar","Anand");
		p.result();
	}
}
