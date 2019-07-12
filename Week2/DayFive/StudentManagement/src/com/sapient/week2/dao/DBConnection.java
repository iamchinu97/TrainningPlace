package com.sapient.week2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection conn = null;
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		if(conn == null) {
			conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ubuntu2963");
		}
		return conn;
	}
	
}