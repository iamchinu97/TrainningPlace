package com.sapient.week2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.sapient.week2.bean.*;
import com.sapient.week2.exceptions.RecordNotFoundException;

public class LoginDAO {
	public static final String query1 = "SELECT username, password, role FROM users";
	public static final String commitCommand = "COMMIT";
	public static final int USERNAME = 1;
	public static final int PASSWORD = 2;
	public static final int ROLE = 3;
	private static LoginDAO sdao;
	public LoginDAO() {
		super();
	}
	public static LoginDAO getInstance() {
		if(sdao==null) {
			sdao = new LoginDAO();
		}
		return sdao;
	}
	public Map<String,UserBean> getUserDetails() throws SQLException, RecordNotFoundException, ClassNotFoundException{
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(query1);
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData meta=rs.getMetaData();
		Map<String, UserBean> userList= new TreeMap<String, UserBean>();
		userList.put("column_name", new UserBean(meta.getColumnName(1),meta.getColumnName(2),meta.getColumnName(2)));
		while(rs.next())
		{
			String s1=rs.getString(1);
			String s2=rs.getString(2);
			String s3=rs.getString(3);
			userList.put(s1,new UserBean(s1,s2,s3));
		}
		return userList;
	}
}
