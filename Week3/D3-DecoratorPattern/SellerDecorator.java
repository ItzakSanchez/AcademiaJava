package com.edgaritzak.decoratorpattern;

public abstract class SellerDecorator implements MenuSellerInterface {
	
	protected MenuSellerInterface menuSeller;

	public SellerDecorator(MenuSellerInterface menuSeller) {
		super();
		this.menuSeller = menuSeller;
	}
	
	@Override
	public String makeOrder(String type, int quantity) {
		menuSeller.makeOrder(type, quantity);
		return "type"+type+" quantity"+quantity;
	}
}
