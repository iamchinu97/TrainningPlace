package com.sapient.week2.bundle;

import java.util.ResourceBundle;

public class ReBundle {
	public static String getValueStudent(String key)
	{
		ResourceBundle rs = ResourceBundle.getBundle("student");
		return rs.getString(key);		
	}
	public static String getValueUser(String key)
	{
		ResourceBundle rs = ResourceBundle.getBundle("user");
		return rs.getString(key);		
	}

}
