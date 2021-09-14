package com.priorityqueue;

import java.util.PriorityQueue;

public class ComparePriorityyQueue {
	public static void main(String args[]) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Black");
		queue.add("Orange");
		queue.add("White");
		System.out.println("Elements of 1st Queue :"+queue);
		
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.add("Red");
		queue1.add("Black");
		queue1.add("Orange");
		queue1.add("grey");
		System.out.println("Elements of 2st Queue :"+queue1);
		
		System.out.println(queue.equals(queue1));
	}
	

}
