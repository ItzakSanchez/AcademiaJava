package com.edgaritzak.decoratorpattern;

public class MenuSeller implements MenuSellerInterface {
	
	String type;
	int quantity;

	@Override
	public String makeOrder(String type, int quantity) {
		System.out.println(quantity+" "+type+" pizza");
		return "type"+type+" quantity"+quantity;
	}

}
