package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {
	public static void main(String args[]) {
		​​​​​Connection connection = null;
        final String username = "sa";
        final String password = "";
        final String jdbcurl = "jdbc:h2:~/test";

        String selectsql = "";
        try {​​​​​
            Class.forName("org.h2.Driver"); ///
            connection = DriverManager.getConnection(jdbcurl, username, password);/// authentication
            Statement statement = connection.createStatement();// this used for creating sql statement
            String sql = "CREATE TABLE customer " + "(id INTEGER not NULL, " +
              " age VARCHAR(255), " + " address VARCHAR(255), " + " salary INTEGER, " +
              " PRIMARY KEY ( id ))";
            String insert = "INSERT INTO CUSTOMER VALUES (3,'32','Ahmedabad',2000);";
            statement.executeUpdate(insert);
            System.out.println("done...");
          }​​​​​ catch (Exception e) {​​​​​
            e.printStackTrace();
        }​​​​​
    }​ ​ ​ ​ ​
}​ ​ ​ ​ ​
