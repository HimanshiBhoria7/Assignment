package com.threaddemo;

class RunnableDemo extends Thread{
	public void run() {
		try {
			System.out.println("Thread is : "+Thread.MAX_PRIORITY);
			System.out.println("The Runnable Threads are : "+Thread.currentThread());
			
		}
		catch(Exception e) {
			System.out.println("An Exception has occured"+e);
		}
	}
}

public class RunnableThread {
	public static void main(String args[]) {
		int threadnumber = 6;
		for(int i=0 ;i<threadnumber ;i++) {
			RunnableDemo runnableDemo = new RunnableDemo();
			runnableDemo.start();
			runnableDemo.currentThread();
			
		}
	}
	
	

}
