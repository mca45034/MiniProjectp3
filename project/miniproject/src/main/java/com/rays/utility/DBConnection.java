package com.rays.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection conn;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/minapp";
		String username="root";
		String userpass="root";
		Class.forName(driver);
		conn=DriverManager.getConnection(url,username,userpass);
		return conn;
	}
	
}
