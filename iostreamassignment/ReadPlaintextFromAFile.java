package com.iostreamassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadPlaintextFromAFile {
	public static void main(String args[]) throws IOException {
		File file = new File("D:/io/iofile.txt");
		BufferedReader bs = new BufferedReader(new FileReader(file));
		String string;
		while((string = bs.readLine()) != null) {
			System.out.println(string);
		}
		
	}

}
