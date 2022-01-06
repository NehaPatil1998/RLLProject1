package com.java.jdbc;

import java.sql.SQLException;
import java.util.List;

public class MenuShow {

	public static void main(String[] args) {
		MenuDAO dao = new MenuDAO();
		try {
			List<Menu> menulist = dao.showmenu();
			for (Menu menuNew : menulist) {
				System.out.println(menuNew);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

