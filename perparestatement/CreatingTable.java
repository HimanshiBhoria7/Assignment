package com.perparestatement;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class CreatingTable {
	public static void main(String args[]) {
		Connection connection = null;
		final String username = "sa";
		final String password = "";
		final String jdbcurl = "jdbc:h2:~/test";
		String selectsql = "";
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection(jdbcurl, username, password);
			Statement statement = connection.createStatement();
			String sql = " CREATE TABLE emp " + "(id INTEGER not NULL, " + " name VARCHAR(255), " + " salary INTEGER, "
					+ " PRIMARY KEY ( id ))";
			statement.execute(sql);
			System.out.println(" Table is created of emp ");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
