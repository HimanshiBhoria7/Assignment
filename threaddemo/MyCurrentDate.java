package com.threaddemo;
import java.util.Date;

class DemoClass implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			try {

				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
	 }	
  }
}
public class MyCurrentDate {
	public static void main(String args[]) {
		DemoClass demoClass = new DemoClass();
		demoClass.run();
		System.out.println("Current Date is : "+new Date());
	}
}
