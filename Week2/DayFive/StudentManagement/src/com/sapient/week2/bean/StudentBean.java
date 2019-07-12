package com.sapient.week2.bean;

public class StudentBean {
	
	private String Marks;
	private String firstName;
	private String lastName;
	private String registartionId;
	public StudentBean() {
		// TODO Auto-generated constructor stub
		super();
	}
	public StudentBean(String registartionId,String firstName, String lastName,String marks ) {
		super();
		Marks = marks;
		this.firstName = firstName;
		this.lastName = lastName;
		this.registartionId = registartionId;
	}
	public String getMarks() {
		return Marks;
	}
	public void setMarks(String marks) {
		Marks = marks;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRegistartionId() {
		return registartionId;
	}
	public void setRegistartionId(String registartionId) {
		this.registartionId = registartionId;
	}
}
