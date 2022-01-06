package com.java.jdbc;

import java.sql.SQLException;
import java.util.List;

public class OrderShow {
	public static void main(String[] args) throws SQLException {
		OrderDAO dao = new OrderDAO();
		List<Order> OrderList = dao.OrderShow();
		for (Order order : OrderList) {
			System.out.println(order);
		}
	}

}
