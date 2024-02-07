package com.capgemini.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");//Load and register driver
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_22","root","Mysql@1701");
		System.out.println("Connection Established");
		return con;
	}
}