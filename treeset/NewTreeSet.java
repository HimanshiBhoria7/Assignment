package com.treeset;
import java.util.*;

public class NewTreeSet {
	public static void main(String args[]) {
		NavigableSet<String> nav = new TreeSet<String>();
		nav.add("Red");
		nav.add("yellow");
		nav.add("black");
		System.out.println("Colors of tree are : "+nav);
	}

}
