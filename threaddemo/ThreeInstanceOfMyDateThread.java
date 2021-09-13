package com.threaddemo;
import java.util.Date;

class Demo1 extends Thread{
	public void run() {
		try {
			System.out.println("The current Date is : "+new Date());
		}
		catch(Exception e){
			System.out.println("Exception Occured : "+e);
		}
	}
}
public class ThreeInstanceOfMyDateThread {
	public static void main(String args[]) {
		Demo1 demo1 = new Demo1();
		demo1.start();
		
	}

}
