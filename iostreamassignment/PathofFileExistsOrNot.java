package com.iostreamassignment;

import java.io.File;

public class PathofFileExistsOrNot {
	public static void main(String args[]) {
		File list = new File("D:/io/iofile.txt");
		if(list.exists()) {
			System.out.println("File Exists");
		}
		else {
			System.out.println("Not Exists");
		}	
	}
}
