package com.edgaritzak.product;

public class HouseholdAppliances extends product{
	private String brand;
	private String model;
	private String type;

public HouseholdAppliances(String name, Double price, String brand, String model, String type) {
	super(name, price);
	this.brand = brand;
	this.model = model;
	this.type = type;
}

	@Override
	double getfinalPrice(){
		// 20% tax
		return price *1.20;
	}
	
	@Override
	String verifyCaducity() {
		return "N/A";
	}

	@Override
	public String toString() {
		return "HouseholdAppliances [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", model="
				+ model + ", type=" + type + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	
	
	
}
