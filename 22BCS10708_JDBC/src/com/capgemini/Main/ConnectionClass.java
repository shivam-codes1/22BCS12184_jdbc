package com.capgemini.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	
	public Connection getConnection() throws ClassNotFoundException,SQLException {
		
		
// Connect to Database.
		
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuims_815","root","PHW#84#jeor");
		System.out.println("Connection Established");
		
		System.out.println(con.getClass().getName());
		

		return con;
	}

}