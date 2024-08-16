package com.edgaritzak.product;

public class Fruits_Vegtables extends product{
	private String type;
	private double kilograms;
	
	public Fruits_Vegtables(String name, Double price, String type, double kilograms) {
		super(name, price);
		this.type = type;
		this.kilograms = kilograms;
	}
	
	@Override
	double getfinalPrice() {	
		 //tax free
		return kilograms*price;
	}
	
	@Override
	String verifyCaducity() {
		// TODO Auto-generated method stub
		return "Please check product freshness";
	}
	
	@Override
	public String toString() {
		return "Fruits_Vegtables [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", kilograms="
				+ kilograms + "]";
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getKiloGrams() {
		return kilograms;
	}
	
	public void setKilograms(double kilograms) {
		this.kilograms = kilograms;
	}
	
	
}
