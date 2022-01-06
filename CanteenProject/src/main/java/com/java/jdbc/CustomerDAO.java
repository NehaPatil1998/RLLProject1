package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CustomerDAO {
	
	Connection connection;
	PreparedStatement pst;

	public List<Customer> CustomerShow() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from customer";
		pst = connection.prepareStatement(cmd);
		ResultSet mn = pst.executeQuery();
		List<Customer> custlist = new ArrayList<Customer>();
		Customer cust = null; 
		while(mn.next()) {
			cust = new Customer();
			cust.setCustomerID(mn.getInt("CustomerID"));
			cust.seFirstname(mn.getString("Firstname"));
			cust.setLastname(mn.getString("Lastname"));
			cust.setgender(mn.getString("gender"));
			cust.setcity(mn.getString("city"));
			cust.setZipcode(mn.getString("Zipcode"));
			cust.setstate(mn.getString("state"));
			cust.setcountry(mn.getString("country"));
			cust.setDOB(mn.getDate("DOB"));

			custlist.add(cust);
		}
		return custlist;
	}
	public Customer CustomerSearch(int CustomerID) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from customer where CustomerID=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, CustomerID);
		ResultSet cu = pst.executeQuery();
		Customer cust = null;
		if (cu.next()) {
			cust = new Customer();
			cust.setCustomerID(cu.getInt("CustomerID"));
			cust.seFirstname(cu.getString("Firstname"));
			cust.setLastname(cu.getString("Lastname"));
			cust.setgender(cu.getString("gender"));
			cust.setcity(cu.getString("city"));
			cust.setZipcode(cu.getString("Zipcode"));
			cust.setstate(cu.getString("state"));
			cust.setcountry(cu.getString("country"));
			cust.setDOB(cu.getDate("DOB"));
		}
		return cust;
}
}
