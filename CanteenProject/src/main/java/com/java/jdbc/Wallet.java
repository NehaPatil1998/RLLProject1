package com.java.jdbc;

public class Wallet {
	private int Wallet_ID;
	private int CustomerID;
	private String wallet_Type;
	private int Amount;
	
	public int getWallet_ID() {
		return Wallet_ID;
	}
	public void setWallet_ID(int Wallet_ID) {
		this.Wallet_ID = Wallet_ID;
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int CustomerID) {
		this.CustomerID = CustomerID;
	}
	
	public String getwallet_Type() {
		return wallet_Type;
	}
	public void setwallet_Type(String wallet_Type) {
		this.wallet_Type = wallet_Type;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int Amount) {
		this.Amount = Amount;
	}
	
	public Wallet() {
		// TODO Auto-generated constructor stub
	}

	public Wallet(int walletId, int CustomerID, String walletType,int Amount) {
		this.Wallet_ID = walletId;
		this.CustomerID = CustomerID;
		this.wallet_Type = walletType;
		this.Amount=Amount;
	}
	@Override
	public String toString() {
		return "Wallet [walletId=" + Wallet_ID + ", customerId=" + CustomerID + ", walletType=" + wallet_Type + ",  Amount=" + Amount + "]";
	}


}
