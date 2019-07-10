package com.sapient.week2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	static Connection conn=null;
	
	public static Connection getConnection() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		if(conn==null)
		{
			conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ubuntu2963");
		}
		return conn;
	}
}

