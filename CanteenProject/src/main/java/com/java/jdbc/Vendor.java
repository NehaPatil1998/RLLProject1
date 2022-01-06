package com.java.jdbc;

public class Vendor {
	private int VendorId;
	private String VendorName;
	private String VendorState;
	private String VendorCity;
	private String VendorEmail;
	private String VendorMobile;
	
	
	public int getvendorId() {
		return VendorId;
	}
	public void setvendorId(int vendorId) {
		this.VendorId = vendorId;
	}
	public String getvendorName() {
		return VendorName;
	}
	public void setvendorName(String vendorName) {
		this.VendorName = vendorName;
	}
	public String getvendorState() {
		return VendorState;
	}
	public void setvendorState(String vendorState) {
		this.VendorState = vendorState;
	}
	public String getvendorCity() {
		return VendorCity;
	}
	public void setvendorCity(String vendorCity) {
		this.VendorCity = vendorCity;
	}
	public String getvendorEmail() {
		return VendorEmail;
	}
	public void setvendorEmail(String vendorEmail) {
		this.VendorEmail = vendorEmail;
	}
	
	public String getvendorMobile() {
		return VendorMobile;
	}
	public void setvendorMobile(String vendorMobile) {
		this.VendorMobile = vendorMobile;
	}
	
	public Vendor() {
		// TODO Auto-generated constructor stub
	}

	public Vendor(int vendorId, String vendorName, String vendorState,String vendorCity, String vendorEmail,String vendorMob) {
		this.VendorId = vendorId;
		this.VendorName = vendorName;
		this.VendorState = vendorState;
		this.VendorCity=vendorCity;
		this.VendorEmail = vendorEmail;
		this.VendorMobile=VendorMobile;
	}
	@Override
	public String toString() {
		return "Vendor [vendorId=" + VendorId + ", vendorName=" + VendorName + ", vendorState=" + VendorState + ",  vendorCity=" + VendorCity + ", vendorEmail=" + VendorEmail + " , vendorMobile=" + VendorMobile + "]";
	}


}
