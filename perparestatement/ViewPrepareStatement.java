package com.perparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewPrepareStatement {
	public static void main(String ar[]) {
		Connection connection = null;
		final String username = "sa";
		final String password = "";
		final String jdbcurl = "jdbc:h2:~/test";
		String selectsql = "";
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection(jdbcurl, username, password);/// authentication
			Statement statement = connection.createStatement();// this used for creating sql statement
			// for retrieve we use result set
			selectsql = "select * from EMP ";
			ResultSet rs = statement.executeQuery(selectsql);
			while (rs.next()) {
				System.out.print(" ID is : " + rs.getInt("id"));
				System.out.print(" Name is : " + rs.getString("name"));
				System.out.print(" Salary is : " + rs.getString("salary"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}