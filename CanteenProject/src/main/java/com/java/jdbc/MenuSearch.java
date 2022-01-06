package com.java.jdbc;

import java.sql.SQLException;
import java.util.Scanner;


public class MenuSearch {

	public static void main(String[] args) {
		int menuno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter MEnu No   ");
		menuno = sc.nextInt();
		MenuDAO dao = new MenuDAO();
		try {
			Menu menu = dao.searchMenu(menuno);
			if (menu!=null) {
				System.out.println(menu);
			} else {
				System.out.println("*** Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}