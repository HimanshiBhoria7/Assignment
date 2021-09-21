package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 

public class AddData {
    public static void main(String ar[]) {
        Connection connection = null;
        final String username = "sa";
        final String password = "";
        final String jdbcurl = "jdbc:h2:~/test";

        String selectsql = "";
        // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); for ms server

 

        // String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
        // String user = "sa";
        // String pass = "";

 

        try {

 

            Class.forName("org.h2.Driver"); ///
            connection = DriverManager.getConnection(jdbcurl, username, password);/// authentication
            Statement statement = connection.createStatement();// this used for creating sql statement
            
              String sql = " CREATE TABLE emp1 " + "(id INTEGER not NULL, " + " name VARCHAR(255), " + " salary INTEGER, "
  					+ " PRIMARY KEY ( id ))";
             
            String insert = "INSERT INTO EMP1 VALUES (3,'Jatin',200);";
            statement.executeUpdate(insert);

            System.out.println("done Sucessfull1...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}