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

import com.sapient.week2.bean.StudentBean;
import com.sapient.week2.exceptions.RecordNotFoundException;

public class StudentDAO {
	public static final String query1 = "SELECT registration_no, firstname, lastname, marks FROM student";
	public static final String commitCommand = "COMMIT";
	public static final int REGISTRATION_ID = 1;
	public static final int FIRST_NAME = 2;
	public static final int LAST_NAME = 3;
	public static final int MARKS = 4;
	private static StudentDAO sdao;
	public StudentDAO() {
		super();
	}
	public static StudentDAO getInstance() {
		if(sdao==null) {
			sdao = new StudentDAO();
		}
		return sdao;
	}
	public Map<String, StudentBean> getStudentDetails() throws SQLException, RecordNotFoundException, ClassNotFoundException{
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(query1);
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData meta=rs.getMetaData();
		Map<String,StudentBean> studentList= new TreeMap<String, StudentBean>();
		studentList.put("column_name", new StudentBean(meta.getColumnName(1),meta.getColumnName(3),meta.getColumnName(4),meta.getColumnName(2)));
		while(rs.next())
		{
			String s1=rs.getString(1);
			String s2=rs.getString(2);
			String s3=rs.getString(3);
			String s4=rs.getString(4);
			studentList.put(s1,new StudentBean(s1,s2,s3,s4));
		}
		return studentList;
	}
	
}
