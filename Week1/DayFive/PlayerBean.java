package com.sapient.week1.day5;

public class PlayerBean {
	private String id;
	private String firstname;
	private String lastname;
	private int jersey_no;
	public PlayerBean(String id, String firstname, String lastname, int jersey_no) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.jersey_no = jersey_no;
	}
	public PlayerBean() {
		super();
	}
	@Override
	public String toString() {
		return "[id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", jersey_no="
				+ jersey_no + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getJersey_no() {
		return jersey_no;
	}
	public void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}

	
}
