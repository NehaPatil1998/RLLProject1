package com.java.jdbc;

public class Restaurant {
	private int restaurantid;
	private String restauratname;
	private String  restaurantcity;
	private String  restaurantbranch;
	private String email;
	private String contactno;
	public int getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(int restaurantid) {
		this.restaurantid = restaurantid;
	}
	
	public String getRestaurantcity() {
		return    restaurantcity;
	}
	public void setRestaurantcity(String city) {
		this.restaurantcity = restaurantcity;
	}
	public String getRestaurantBranch() {
		return  restaurantbranch;
	}
	public void setRestaurantbranch(String branch) {
		this. restaurantbranch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String toString() {
		return "Restaurant [restaurantid=" + restaurantid + ", restauratname=" + restauratname + ", city=" +  restaurantcity
				+ ", branch=" +  restaurantbranch + ", email=" + email + ", contactno=" + contactno + "]";
	}
	public String getRestauratname() {
		return restauratname;
	}
	public void setRestauratname(String restauratname) {
		this.restauratname = restauratname;
	}
	
	 
	}
