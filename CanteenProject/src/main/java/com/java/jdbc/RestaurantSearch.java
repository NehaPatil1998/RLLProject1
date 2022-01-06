package com.java.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class RestaurantSearch {
	public static void main(String[] args) {
		int restaurantid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Restaurant id");
		restaurantid = sc.nextInt();
		RestaurantDAO dao = new RestaurantDAO();
		try {
			Restaurant restaurant = dao.searchRestaurant(restaurantid);
			if (restaurant!=null) {
				System.out.println(restaurant);
			} else {
				System.out.println("*** Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

