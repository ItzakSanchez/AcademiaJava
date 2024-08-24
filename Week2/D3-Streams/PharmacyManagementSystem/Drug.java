package com.edgaritzak.pharmacyManagementSystem;

import java.util.Objects;

public abstract class Drug {
	private static int counter = 0;
	private int id;
	private String name;
	private double price;
	
	public Drug(String name, double price) {
		super();
		this.id = counter++;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drug other = (Drug) obj;
		return id == other.id;
	}
}
