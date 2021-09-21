package com.jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayingTheParticularRecord {
	public static void main(String args[]) {
		Connection connection = null;
		final String username = "sa";
		final String password = "";
		final String jdbcurl = "jdbc:h2:~/test";
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection(jdbcurl, username, password);
			Statement statement = connection.createStatement();
			String sqlquery = " SELECT empno,ename FROM employee1";
			ResultSet rs = statement.executeQuery(sqlquery);
        	while(rs.next()) {
        		System.out.println("Emp No " +rs.getInt("empno"));
        		System.out.println("Emp Name " +rs.getString("ename"));
        	}	
			statement.execute(sqlquery);
			System.out.println(" Data of Employee1 Table ");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
