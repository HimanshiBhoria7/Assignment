package com.jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatingTable {
	public static void main(String args[]) {
		Connection connection = null;
		final String username = "sa";
		final String password = "";
		final String jdbcurl = "jdbc:h2:~/test";
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection(jdbcurl, username, password);
			Statement statement = connection.createStatement();
			String sqlquery = " CREATE TABLE employee " + " (ID INTEGER not null ," + 
			" Name VARCHAR(255), " + " Salary INTEGER, " + " PRIMARY KEY ( id ))";
			statement.execute(sqlquery);
			System.out.println(" Table employee is created : ");
			
			String insert = "INSERT INTO employee1 ";
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
