package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewData {
    public static void main(String ar[]) {
        Connection connection = null;
        final String username = "sa";
        final String password = "";
        final String jdbcurl = "jdbc:h2:~/test";
        String selectsql = "";
        try {
            Class.forName("org.h2.Driver"); ///
            connection = DriverManager.getConnection(jdbcurl, username, password);/// authentication
            Statement statement = connection.createStatement();// this used for creating sql statement
            // for retrieve we use resultset
            selectsql = "select * from CUSTOMER ";
            ResultSet rs = statement.executeQuery(selectsql);
            while (rs.next()) {
                System.out.print("ID is: " + rs.getInt("id"));
                System.out.print("age is: " + rs.getString("age"));
                System.out.print("addres: is " + rs.getString("address"));
                System.out.print("salary is : " + rs.getString("salary"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}