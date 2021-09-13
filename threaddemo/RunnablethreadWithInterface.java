package com.threaddemo;

class RunnableThread1 implements Runnable{
	public void run() {
		try {
			System.out.println("The Running threads are : "+Thread.currentThread());
		}
		catch(Exception e) {
			System.out.println("Error has occured : "+e);
		}
	}
}

public class RunnablethreadWithInterface {
	public static void main(String args[]) {
		int threadnumber = 3;
		for(int i=0;i<threadnumber;i++) {
			RunnableThread1 runnableThread = new RunnableThread1();
			runnableThread.run();
			
			
			
		}
	}

}


