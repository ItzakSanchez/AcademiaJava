package com.edgaritzak.RestaurantQueueManagementSystem;

import java.util.ArrayList;

public class Table {
	private static int counter;
	private int id;
	private ArrayList<MenuItem> orderList;
	
	
	public Table(ArrayList<MenuItem> orderList) {
		this.id = counter++;
		this.orderList = orderList;
	}
	public ArrayList<MenuItem> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<MenuItem> orderList) {
		this.orderList = orderList;
	}
	public int getId() {
		return id;
	}
	
}
