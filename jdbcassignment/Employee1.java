package com.jdbcassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee1 {
	public static void main(String args[]) {
		Connection connection = null;
		final String username = "sa";
		final String password = "";
		final String jdbcurl = "jdbc:h2:~/test";
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection(jdbcurl, username, password);
			Statement statement = connection.createStatement();
			String sqlquery = " CREATE TABLE employee1 " 
			+ " (empno number(4,0)," 
			+ "ename varchar2(10), " 
			+ " job varchar2(9), " 
			+ " mgr number(4,0),"
			+ " hiredate date,"
			+ " sal number(7,2),"
			+ " comm number(7,2), "
			+ "deptno number(2,0),"
			+ "constraint pk_emp primary key (empno), "
			+ "constraint fk_deptno foreign key (deptno) references dept (deptno) )";
			String values = "INSERT INTO employee1 Values (104,'gam','Sales',4,'2013-04-02',2500,8,1)";
			
//			statement.execute(sqlquery);
			statement.executeUpdate(values);
//			System.out.println(" Table employee1 is created : ");
			System.out.println(" Tables are Inserted into Employee Table ");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
