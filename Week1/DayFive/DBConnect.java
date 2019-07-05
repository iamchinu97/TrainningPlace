package com.sapient.week1.day5;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	static Connection conn=null;
	public static Connection getConnection() throws Exception
	{
		if(conn==null)
		{
			conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ubuntu2963");
		}
		return conn;
	}
}
