package com.perparestatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddingData {
	public static void main(String args[])throws Exception {
		Class.forName("org.h2.Driver");
		Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		PreparedStatement ps = connection.prepareStatement("insert into emp values(?,?,?)");
		
		//Taking Values
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println(" Enter the Id : ");
			int id = Integer.parseInt(br.readLine());
			System.out.println(" Enter Your Name : ");
			String name = br.readLine();
			System.out.println(" Enter your Salary : ");
			int salary = Integer.parseInt(br.readLine());
			
			ps.setInt(1 , id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			
			int i = ps.executeUpdate();
			System.out.println(i + "Records are added ");
			
			System.out.println("Do you want to continue : yes/no ");
			String s = br.readLine();
			if(s.startsWith("no")) {
				break;
			}
		}while(true);
		connection.close();
		
	}

}
