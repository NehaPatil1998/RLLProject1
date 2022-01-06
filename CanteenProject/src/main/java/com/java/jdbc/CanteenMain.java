package com.java.jdbc;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class CanteenMain {


	static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("---------------");
			System.out.println("1. Show Restaurant ");
			System.out.println("2. Search Restaurant");
			System.out.println("3. Show Menu");
			System.out.println("4. Search Menu");
			System.out.println("5. Show Vendor ");
			System.out.println("6. Search Vendor");
			System.out.println("7. Show Customer ");
			System.out.println("8. Search Cutomer");
			System.out.println("9. Show Wallet ");
			System.out.println("10. Wallet id= ");
			System.out.println("11. Add Restaurant");
			System.out.println("12.place order");
			System.out.println("13.accept or reject order");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				showRestaurant();
				break;
			case 2 : 
				try {
					searchRestaurant();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3 : 
				showMenu();
				break;
			case 4 : 
				try {
					searchMenu();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5 : 
				showVendor();
				break;
			case 6 : 
				try {
					searchVendor();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 7 :
				showCustomer();
				return;
			case 8 : 
				try {
					searchCustomer();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 9:
				try {
					searchWalletbycid();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return;
			case 10:
				try {
					searchWalletbywid();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 11:
				try {
					addRestaurant();
				} catch (ClassNotFoundException | ParseException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return;
			case 12 : 
				try {
					placeOrder();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 13 : 
				try {
					acceptOrReject();
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case 14 : 
				return;
			}
		} while(choice!=14);
	}
	public static void searchRestaurant() throws ClassNotFoundException, SQLException {
		int rid;
		System.out.println("Enter Restaurant id   ");
		rid = sc.nextInt();
		Restaurant restaurant = new RestaurantDAO().searchRestaurant(rid);
		System.out.println(restaurant);
	}
	public static void showRestaurant() {
		try {
			List<Restaurant> restaurantList = new RestaurantDAO().showRestaurant();
			for (Restaurant restaurant : restaurantList) {
				System.out.println(restaurant);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void searchMenu() throws ClassNotFoundException, SQLException {
		int mid;
		System.out.println("Enter Menu id   ");
		mid = sc.nextInt();
		Menu menu = new MenuDAO().searchMenu(mid);
		System.out.println(menu);
		}
	
		public static void showMenu() {
			try {
				List<Menu> menuList = new MenuDAO().showmenu();
				for (Menu menu : menuList) {
					System.out.println(menu);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void searchVendor() throws ClassNotFoundException, SQLException {
			int vendorid;
			System.out.println("Enter Vendor id   ");
			vendorid = sc.nextInt();
			Vendor vendor = new VendorDAO().searchVendor(vendorid);
			System.out.println(vendor);
		}
		public static void showVendor() {
			try {
				List<Vendor> vendorList = new VendorDAO().showVendor();
				for (Vendor vendor : vendorList) {
					System.out.println(vendor);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void searchCustomer() throws ClassNotFoundException, SQLException {
			int CustomerID;
			System.out.println("Enter Customer id   ");
			CustomerID = sc.nextInt();
			Customer customer = new CustomerDAO().CustomerSearch(CustomerID);
			System.out.println(customer);
		}
		public static void showCustomer() {
			try {
				List<Customer> customerList = new CustomerDAO().CustomerShow();
				for (Customer customer : customerList) {
					System.out.println(customer);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void searchWalletbycid() throws ClassNotFoundException, SQLException {
			int customerid;
			System.out.println("Enter customer Id to search wallet  ");
			customerid = sc.nextInt();
			List<Wallet> wallet = new WalletDAO().searchByCustomerId(customerid);
			System.out.println(wallet);
			
		}
		public static void searchWalletbywid() throws ClassNotFoundException, SQLException {
			int wallet_id;
			System.out.println("Enter wallet Id to search wallet  ");
			wallet_id = sc.nextInt();
			Wallet wallet = new WalletDAO().searchByWalletId(wallet_id);
			System.out.println(wallet);
			
		}

		public static void addRestaurant() throws ParseException, ClassNotFoundException, SQLException {
			Restaurant restaurant = new Restaurant();
			System.out.println("Enter Restaurant Id  ");
			restaurant.setRestaurantid(sc.nextInt());
			System.out.println("Enter Restaurant Name   ");
			restaurant.setRestauratname (sc.next());
			System.out.println("Enter Restaurant City   ");
			restaurant.setRestaurantcity (sc.next());
			System.out.println("Enter Restaurant Branch ");
			restaurant.setRestaurantbranch (sc.next());
			System.out.println("Enter Restaurant Email ");
			restaurant.setEmail(sc.next());
			System.out.println("Enter Restaurant Mobile  ");
			restaurant.setContactno (sc.next());
			RestaurantDAO dao = new RestaurantDAO();
			try {
				System.out.println(dao.addRestaurant(restaurant));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public static void acceptOrReject() throws ClassNotFoundException, SQLException {
			int vendorid;
			int orderid;
			String status;
			System.out.println("Enter Vendor Id   ");
			vendorid = sc.nextInt();
			System.out.println("Enter Order Id   ");
			orderid = sc.nextInt();
			System.out.println("Enter Status   ");
			status =sc.next();
			System.out.println(new OrderDAO().acceptOrRejectOrder(orderid, vendorid, status));
		}
		public static void placeOrder() throws ClassNotFoundException, SQLException {
			Order order = new Order();
			System.out.println("Enter Customer Id   ");
			order.setCustomerId(sc.nextInt());
			System.out.println("Enter Vendor Id  ");
			order.setVendorId(sc.nextInt());
			System.out.println("Enter Menu Id  ");
			order.setMenuId(sc.nextInt());
			System.out.println("Enter Wallet Id  ");
			order.setWalletId(sc.nextInt());
			System.out.println("Enter Quantity Ordered  ");
			order.setQuantityOrdered(sc.nextInt());
			System.out.println("Enter Comments  ");
			order.setOrderComments(sc.next());
			OrderDAO dao = new OrderDAO();
			System.out.println(dao.placeOrder(order));
		}



}

