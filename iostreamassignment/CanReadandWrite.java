package com.iostreamassignment;

import java.io.File;

public class CanReadandWrite {
	public static void main(String args[]) {
		File list = new File("D:/io/iofile.txt");
		if(list.canRead()) {
			System.out.println("It can read");
		}
		else {
			System.out.println("It can not read");
		}
		if(list.canWrite()) {
			System.out.println("It can write");
		}
		else {
			System.out.println("Can not write");
		}
	}
}
