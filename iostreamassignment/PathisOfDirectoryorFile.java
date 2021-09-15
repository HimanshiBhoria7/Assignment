package com.iostreamassignment;

import java.io.File;

public class PathisOfDirectoryorFile {
	public static void main(String args[]) {
		File list = new File("D:/io");
		if(list.isDirectory()) {
			System.out.println("It is a directoty");
			}
		else {
			System.out.println("It is a file");
		}
	}
}
