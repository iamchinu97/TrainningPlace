package com.sapient.week2.assessment.bean;

public class BookingsBean {
	String id;
	String name;
	String firstname;
	String lastname;
	String members;
	public BookingsBean(String id, String name, String firstname, String lastname, String members) {
		super();
		this.id = id;
		this.name = name;
		this.firstname = firstname;
		this.lastname = lastname;
		this.members = members;
	}
	
	@Override
	public String toString() {
		return "BookingsBean [id=" + id + ", name=" + name + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", members=" + members + "]";
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMembers() {
		return members;
	}
	public void setMembers(String members) {
		this.members = members;
	}
	
}
