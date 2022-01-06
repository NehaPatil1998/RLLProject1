package com.java.jdbc;

import java.sql.SQLException;
import java.util.List;

public class WalletShow {
	public static void main(String[] args) {
		WalletDAO dao = new WalletDAO();
		try {
			List<Wallet> WalletList = dao.showWallet();
			for (Wallet wallet : WalletList) {
				System.out.println(wallet);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
