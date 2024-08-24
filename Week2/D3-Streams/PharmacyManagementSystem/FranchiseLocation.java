package com.edgaritzak.pharmacyManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class FranchiseLocation {
	private static int counter = 0;
	private int id;
	private String city;
	private String addres;
    private Map<Drug, Integer> inventory = new HashMap<>();
	
	
	public FranchiseLocation(String city, String addres, Map<Drug, Integer> inventory) {
		this.id = counter++;
		this.city = city;
		this.addres = addres;
		this.inventory = inventory;
	}
	
	public int getId() {
		return id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public Map<Drug, Integer> getInventory() {
		return inventory;
	}
	public void setInventory(Map<Drug, Integer> inventory) {
		this.inventory = inventory;
	}

}
