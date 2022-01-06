package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class RestaurantDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String addRestaurant(Restaurant restaurant) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Restaurant(restaurantid,Restaurantname,Restaurant_city,Restaurant_Branch,Email,Contactno)"
				             + "values(?,?,?,?,?,?) ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, restaurant.getRestaurantid());
		pst.setString(2, restaurant.getRestauratname());
		pst.setString(3, restaurant.getRestaurantcity());
		pst.setString(4, restaurant.getRestaurantBranch());
		pst.setString(5, restaurant.getEmail());
		pst.setString(6, restaurant.getContactno());
		pst.executeUpdate();
		return "Record Inserted...";
	}
	
	public Restaurant searchRestaurant(int restaurantid ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurant where restaurantid=? ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, restaurantid);
		ResultSet rs = pst.executeQuery();
		Restaurant restaurant = null;
		if (rs.next()) {
			restaurant = new Restaurant();
			restaurant .setRestaurantid(rs.getInt("restaurantid"));
			restaurant .setRestauratname(rs.getString("restaurantname"));
			restaurant .setRestaurantcity(rs.getString("restaurant_city"));
			restaurant .setRestaurantbranch(rs.getString("restaurant_branch"));
			restaurant .setEmail(rs.getString("email"));
			restaurant .setContactno(rs.getString("contactno"));
		}
		return restaurant;
	}
	
	public List<Restaurant> showRestaurant() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurant";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		Restaurant restaurant = null; 
		while(rs.next()) {
			restaurant = new Restaurant();
			restaurant .setRestaurantid(rs.getInt("restaurantid"));
			restaurant.setRestauratname(rs.getString("restaurantname"));
			restaurant .setRestaurantcity(rs.getString("restaurant_city"));
			restaurant .setRestaurantbranch(rs.getString("restaurant_branch"));
			restaurant .setEmail(rs.getString("email"));
			restaurant .setContactno(rs.getString("contactno"));
			restaurantList.add(restaurant );
		}
		return restaurantList;
	}
	
	public int generaterestaurantid() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max(restaurantid) IS NULL then 1 "
				+ " else Max(restaurantid)+1 end restaurantid from Restaurant";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int restaurantid = rs.getInt("restaurantid");
		return restaurantid;
	}
}
