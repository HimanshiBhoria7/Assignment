package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SearchAValue {
	public static void main(String args[]) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Yellow");
		map.put(2,"Green");
		map.put(3,"Grey");
		
		System.out.println(map.containsValue("Yellow"));
		System.out.println(map.containsValue("Black"));
		
	}
}
