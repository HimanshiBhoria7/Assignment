package com.iostreamassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadlinebylineinIo {
	public static void main(String args[]) throws IOException {
		try {
		File list = new File("D:/io/iofile.txt");
		FileReader reader = new FileReader(list);
		BufferedReader bufferReader = new BufferedReader(reader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while((line = bufferReader.readLine())!=null)  
		{
			stringBuffer.append(line);   
			stringBuffer.append("\n");      
		} 
		reader.close();    //closes the stream and release the resources  
		System.out.println("Contents of File: ");  
		System.out.println(stringBuffer.toString());  
		}
		catch(IOException e) {
			
		}
	
	}
}
