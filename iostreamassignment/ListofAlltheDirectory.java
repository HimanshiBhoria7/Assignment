package com.iostreamassignment;

import java.io.File;

public class ListofAlltheDirectory {
	public static void main(String args[]) {
		File list = new File("D:/");
		String[] filelist = list.list();
		for(String listname : filelist) {
			System.out.println(listname);
		}
		
	}

}
