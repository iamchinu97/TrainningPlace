package com.example.bean;

public class StudentBean {
	String rollnum;
	String firstname;
	String lastname;
	String department;
	public StudentBean(String rollnum, String firstname, String lastname, String department) {
		super();
		this.rollnum = rollnum;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
	}
	public StudentBean() {
		super();
	}
	public String getRollnum() {
		return rollnum;
	}
	public void setRollnum(String rollnum) {
		this.rollnum = rollnum;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "StudentBean [rollnum=" + rollnum + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", department=" + department + "]";
	}
	
}
