package com.edgaritzak.product;
import java.time.LocalDate;

public class CannedGoods extends product {
	private String brand;
	private LocalDate expirationDate;
	private String type;
	
	public CannedGoods(String name, Double price, String brand, LocalDate expirationDate, String type) {
		super(name, price);
		this.brand = brand;
		this.expirationDate = expirationDate;
		this.type = type;
	}

	@Override
	double getfinalPrice() {
		// 5% tax
		return price*1.05;
	}

	@Override
	String verifyCaducity() {
		//Compare expiration date vs todays' date
		LocalDate todaysDate = LocalDate.now();
		if (expirationDate.isBefore(todaysDate)) {
			return "This product has not expired";
		} else {
			return "Warning: this product has already expired";
		}
	}

	@Override
	public String toString() {
		return "CannedGoods [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand
				+ ", expirationDate=" + expirationDate + ", type=" + type + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
