package com.edgaritzak.product;

public abstract class product {
	private static int counter = 0;
	protected int id;
	protected String name;
	protected Double price;
	
	public product(String name, Double price) {
		counter++;
		this.id = counter;
		this.name = name;
		this.price = price;
	}
	
	void applyDiscount(int percentage) {
		price =price*(100-percentage)*.01;
	};
	abstract double getfinalPrice();
	abstract String verifyCaducity();

	
	public int getId() {
		return id;
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
