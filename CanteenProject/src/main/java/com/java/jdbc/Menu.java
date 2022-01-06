package com.java.jdbc;
public class Menu {
	
	private int menuid;
	private int restaurantid;
	private String itemname;
	private int calories;
	private String menutype;
	private int price;
	
	public int getmenuid()
	{
		return menuid;
	}
	public void setmenuid(int menuid)
	{
		this.menuid = menuid;
	}
	public int getrestaurantid()
	{
		return restaurantid;
	}
	public void setresturantid(int restaurantid)
	{
		this.restaurantid = restaurantid;
	}
	public String getitemname()
	{
		return itemname;
	}
	public void setitemname(String itemname)
	{
		this.itemname = itemname;
	}
	public String getmenutype()
	{
		return menutype;
	}
	public void setmenutype(String menutype)
	{
		this.menutype = menutype;
	}
	public int getcalories()
	{
		return calories;
	}
	public void setcalories(int calories)
	{
		this.calories = calories;
	}
	public int getprice()
	{
		return price;
	}
	public void setprice(int price)
	{
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [menuid=" + menuid + ", restaurantid=" + restaurantid + ", itemname=" + itemname + ", calories="
				+ calories + ", menutype=" + menutype + ", price=" + price + "]";
	}
	

}
