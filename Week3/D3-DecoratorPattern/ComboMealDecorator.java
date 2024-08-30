package com.edgaritzak.decoratorpattern;

public class ComboMealDecorator extends SellerDecorator{
	
	private String drink;
	private String dip;
	private String side;
	

	public ComboMealDecorator(MenuSellerInterface menuSeller) {
		super(menuSeller);
	}

	@Override
	public String makeOrder(String type, int quantity) {
		System.out.println("You have ordered a combo, it includes:");
		System.out.print("- ");super.makeOrder(type, quantity);
		System.out.println("Complements:");
		System.out.println("- Side: "+side);
		System.out.println("- Dip: "+dip);
		System.out.println("- Drink: "+drink);
		return "type:"+type+" quantity:"+quantity+" side:"+side+" dip:"+dip+" drink:"+drink;
	}
	
	
	public String getDip() {
		return dip;
	}

	public void setDip(String dip) {
		this.dip = dip;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
}

