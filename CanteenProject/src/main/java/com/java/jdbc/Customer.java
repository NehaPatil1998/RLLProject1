package com.java.jdbc;
import java.sql.Date;

public class Customer {
	
	private int CustomerID;
	private String Firstname;
	private String Lastname;
	private String gender;
	private String city;
	private String Zipcode;
	private String state;
	private String country;
	private Date DOB;
	
	public int getCustomerID()
	{
		return CustomerID;
	}
	public void setCustomerID(int CustomerID)
	{
		this.CustomerID=CustomerID;
	}
	public String getFirstname()
	{
		return Firstname;
	}
	public void seFirstname(String Firstname)
	{
		this.Firstname=Firstname;
	}
	public String getLastname()
	{
		return Lastname;
	}
	public void setLastname(String Lastname)
	{
		this.Lastname=Lastname;
	}
	public String getgender()
	{
		return gender;
	}
	public void setgender(String gender)
	{
		this.gender=gender;
	}
	public String getcity()
	{
		return city;
	}
	public void setcity(String city)
	{
		this.city=city;
	}
	public String getZipcode()
	{
		return Zipcode;
	}
	public void setZipcode(String Zipcode)
	{
		this.Zipcode=Zipcode;
	}
		public String getstate()
	{
		return state;
	}
	public void setstate(String state)
	{
		this.state=state;
	}
	public String getcountry()
	{
		return country;
	}
	public void setcountry(String country)
	{
		this.country=country;
	}
	public Date getDOB()
	{
		return DOB;
	}
	public void setDOB(Date DOB)
	{
		this.DOB=DOB;
	}
	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", Firstname=" + Lastname + ",  Lasttname=" + Lastname + ",Gender=" + gender + ", City="
				+ city + ", Zipcode=" + Zipcode + ", State=" + state + ", Country=" + country + ", Date of Birth=" + DOB
				+ "]";
	}
	

}
