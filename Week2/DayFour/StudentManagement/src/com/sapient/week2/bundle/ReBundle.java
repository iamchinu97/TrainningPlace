package com.sapient.week2.bundle;

import java.util.ResourceBundle;

public class ReBundle {
	public static String getValue(String key)
	{
		ResourceBundle rs = ResourceBundle.getBundle("student");
		return rs.getString(key);		
	}

}
