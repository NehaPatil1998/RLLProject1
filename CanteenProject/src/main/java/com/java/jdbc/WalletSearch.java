package com.java.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class WalletSearch {
	public static void main(String[] args) {
		int Wallet_ID;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Wallet_ID=    ");
		Wallet_ID = sc.nextInt();
		WalletDAO dao = new WalletDAO();
		try {
			Wallet wallet = dao.searchWallet(Wallet_ID);
			if (wallet!=null) {
				System.out.println(wallet);
			} else {
				System.out.println("*** Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
