package com.edgaritzak.RestaurantQueueManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		//Create Order Lists
		ArrayList<MenuItem> orderList1 = new ArrayList<MenuItem>();
		ArrayList<MenuItem> orderList2 = new ArrayList<MenuItem>();
		ArrayList<MenuItem> orderList3 = new ArrayList<MenuItem>();
		Main.fillOrderList(orderList1, 1);
		Main.fillOrderList(orderList2, 2);
		Main.fillOrderList(orderList3, 3);
		
		//Create tables
		Table table1 = new Table(orderList1);
		Table table2 = new Table(orderList2);
		Table table3 = new Table(orderList3);
		
		//Create a list of tables
		ArrayList<Table> OrdersbyTableList = new ArrayList<Table>();
		OrdersbyTableList.add(table1);
		OrdersbyTableList.add(table2);
		OrdersbyTableList.add(table3);
		
		//Stream, 
		List<String> allOrders  = OrdersbyTableList.stream()
				.flatMap(t -> t.getOrderList().stream())
				.filter(d -> d.getType().equals("Dish"))
				.map(d -> d.getName())
				.sorted()
				.collect(Collectors.toList());
		
		//print list of all orders
		System.out.println("----------Dishes in Queue ----------");
		allOrders.forEach(x -> System.out.println(x));
		
	}
	
	
	public static void fillOrderList(ArrayList<MenuItem> tableList, int table) {
		
		if(table == 1) {
			tableList.add(new MenuItem("Lentil Soup", 6.99, "Dish"));
			tableList.add(new MenuItem("Cheeseburger", 8.99, "Dish"));
			tableList.add(new MenuItem("Orange Juice", 4.99, "Drink"));
			tableList.add(new MenuItem("Americano Coffee", 2.99, "Drink"));
		}
		if(table == 2) {
			tableList.add(new MenuItem("Caesar Salad", 7.49, "Dish"));
			tableList.add(new MenuItem("Margherita Pizza", 12.99, "Dish"));
			tableList.add(new MenuItem("Chicken Tacos", 9.99, "Dish"));
			tableList.add(new MenuItem("Homemade Lemonade", 3.49, "Drink"));
			tableList.add(new MenuItem("Mojito Cocktail", 7.99, "Drink"));
		}
		if(table == 3) {
			tableList.add(new MenuItem("Carbonara Pasta", 11.49, "Dish"));
			tableList.add(new MenuItem("Lentil Soup", 6.99, "Dish"));
			tableList.add(new MenuItem("Craft Beer", 5.49, "Drink"));
			tableList.add(new MenuItem("Red Wine", 8.99, "Drink"));
		}
	}
}
