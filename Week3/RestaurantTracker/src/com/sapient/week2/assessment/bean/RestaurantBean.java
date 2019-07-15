package com.sapient.week2.assessment.bean;

public class RestaurantBean {
	String id;
	String name;
	String location;
	String timing;
	String cuisines;
	String price_range;
	String rating;
	public RestaurantBean(String id, String name, String location, String timing, String cuisines, String price_range,
			String rating) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.timing = timing;
		this.cuisines = cuisines;
		this.price_range = price_range;
		this.rating = rating;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getCuisines() {
		return cuisines;
	}
	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}
	public String getPrice_range() {
		return price_range;
	}
	public void setPrice_range(String price_range) {
		this.price_range = price_range;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
		
}
