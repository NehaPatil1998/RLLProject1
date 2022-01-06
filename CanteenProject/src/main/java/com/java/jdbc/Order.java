package com.java.jdbc;

import java.sql.Date;

public class Order {

	private int orderId;
	private int vendorId;
	private int  CustomerID;
	private int menuid;
	private int wallet_Id;
	private Date orderDate;
	private int quantityOrdered;
	private String orderStatus;
	private int billAmount;
	private String Comments;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public int getCustomerId() {
		return CustomerID;
	}
	public void setCustomerId(int customerId) {
		this.CustomerID = customerId;
	}
	public int getMenuId() {
		return menuid;
	}
	public void setMenuId(int menuId) {
		this.menuid = menuId;
	}
	public int getWalletId() {
		return wallet_Id;
	}
	public void setWalletId(int walletId) {
		this.wallet_Id = walletId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public String getComments() {
		return Comments;
	}
	public void setOrderComments(String Comments) {
		this.Comments = Comments;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", vendorId=" + vendorId + ", customerId=" + CustomerID + ", menuId="
				+ menuid + ", walletId=" + wallet_Id + ", orderDate=" + orderDate + ", quantityOrdered="
				+ quantityOrdered + ", orderStatus=" + orderStatus + ", billAmount=" + billAmount + ", Comments="
				+ Comments + "]";
	}
	
	
}
