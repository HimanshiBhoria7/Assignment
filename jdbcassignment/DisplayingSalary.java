package com.jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayingSalary {
	public static void main(String args[]) {
		Connection connection = null;
		final String username = "sa";
		final String password = "";
		final String jdbcurl = "jdbc:h2:~/test";
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection(jdbcurl, username, password);
			Statement statement = connection.createStatement();
			String sqlquery = " SELECT ename,job,sal,comm FROM employee1 WHERE sal>1000 AND sal<2000 ";
			ResultSet rs = statement.executeQuery(sqlquery);
        	while(rs.next()) {
        		System.out.println(" Emp No :" +rs.getInt("empno"));
        		System.out.println(" Job : "+rs.getString("job"));
        		System.out.println(" Salary :"+rs.getInt("sal"));
        		System.out.println(" Comm :"+rs.getInt("comm"));
        	}	

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
