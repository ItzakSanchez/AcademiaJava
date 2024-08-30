package com.edgaritzak.JPARestaurant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_menu")
public class MenuItem {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="MenuId")
	private int id;
	
	@Column(name="ItemName")
	private String name;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Category")
	private String category;
	
	@Column(name="Price")
	private double price;

	public MenuItem() {
		
	}
	public MenuItem(String name, String description, String category, double price) {
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	
}
