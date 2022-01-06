package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WalletDAO {
	Connection connection;
	PreparedStatement pst;
	
//	public String addRestaurent(Restaurent restaurent) throws ClassNotFoundException, SQLException {
//		connection = ConnectionHelper.getConnection();
//		String cmd = "Insert into Restaurent(restaurentId,restaurentName,restaurentCity,restaurentBranch,restaurentEmail,restaurentContactNo) "
//				+ " values(?,?,?,?,?,?)";
//		pst = connection.prepareStatement(cmd);
//		pst.setInt(1, restaurent.getrestaurentId());
//		pst.setString(2, restaurent.getrestaurentName());
//		pst.setString(3, restaurent.getrestaurentCity());
//		pst.setString(4, restaurent.getrestaurentBranch());
//		pst.setString(5, restaurent.getrestaurentEmail());
//		pst.setString(6, restaurent.getrestaurentContactNo());
//		pst.executeUpdate();
//		return "Record Inserted...";
//	}
	
	public List<Wallet> searchByCustomerId(int customerId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from wallet where customerid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, customerId);
		ResultSet rs = pst.executeQuery();
		List<Wallet> walletList = new ArrayList<Wallet>();
		Wallet wallet = null;
		while(rs.next()) {
			wallet = new Wallet();
			wallet.setWallet_ID(rs.getInt("wallet_id"));
			wallet.setCustomerID(rs.getInt("customerid"));
			wallet.setwallet_Type(rs.getString("wallet_type"));
			wallet.setAmount(rs.getInt("amount"));
			walletList.add(wallet);
		}
		return walletList;
		
	}
	
	public String deductBalance(int wallet_Id, int billAmount) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "update wallet set amount=amount-? where wallet_id=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, billAmount);
		pst.setInt(2, wallet_Id);
		pst.executeUpdate();
		return "Amount Deducted...";
	}
	
	public Wallet searchByWalletId(int wallet_id) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from wallet where wallet_id=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, wallet_id);
		ResultSet rs = pst.executeQuery();
		Wallet wallet = null;
		if(rs.next()) {
			wallet = new Wallet();
			wallet.setWallet_ID(rs.getInt("wallet_id"));
			wallet.setCustomerID(rs.getInt("customerid"));
			wallet.setwallet_Type(rs.getString("wallet_type"));
			wallet.setAmount(rs.getInt("amount"));
		}
		return wallet;
		
	}
	
	
	
	

}
