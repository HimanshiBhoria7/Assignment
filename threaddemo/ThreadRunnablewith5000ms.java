package com.threaddemo;

class DemoThread implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			try {

				Thread.sleep(5000);
				System.out.println(i);
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
	 }	
  }
	
}

public class ThreadRunnablewith5000ms {
	public static void main(String args[]) {
		DemoThread demo = new DemoThread();
		demo.run();
	}

}
