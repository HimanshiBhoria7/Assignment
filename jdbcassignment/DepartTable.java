package com.jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DepartTable {
	public static void main(String args[]) {
		Connection connection = null;
		final String username = "sa";
		final String password = "";
		final String jdbcurl = "jdbc:h2:~/test";
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection(jdbcurl, username, password);
			Statement statement = connection.createStatement();
			String sqlquery = " CREATE TABLE dept " 
			+ " (deptno number(2,0), " 
		    + " dname varchar2(14), " 
			+ " loc varchar2(13), " 
		    + "constraint pk_dept primary key (deptno))";
			String values = "INSERT INTO dept Values (1,'Ram1','GGN')";
//			statement.execute(sqlquery);
			statement.executeUpdate(values);
//			System.out.println(" Table Dept is created ");
			System.out.println("Tables are inserted into Deptt");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}


}
