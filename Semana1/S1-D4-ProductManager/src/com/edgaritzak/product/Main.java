package com.edgaritzak.product;

import java.time.LocalDate;

import com.edgaritzak.product.product;
public class Main {

	public static void main(String[] args) {
		
		product[] productArray = {
			new Fruits_Vegtables("Ocean Spray Green Seedless Grapes", 2.99, "Fruit", 1.19),
			new HouseholdAppliances("Refrigerator French door 25ft", 1199.99, "Whirlpool", "WD5620S", "Refrigerator"),
			new CannedGoods("Heinz Baked Beans - 13.7oz – Jolly Posh Foods", 1.50, "Heinz", LocalDate.parse("2025-08-14"), "Beans"),	
			new CannedGoods("Del Monte Canned Fresh Cut Golden Sweet Whole Kernel Corn", 1.19, "Heinz", LocalDate.parse("2024-02-07"), "Corn"),		
			new Fruits_Vegtables("Golden Delicious Apples | Stemilt", 1.99, "Fruit", 2.53)
		};

		for(product p:productArray) {
			//System.out.println(p.toString());
			System.out.println(p.getName()+"\n - Caducity status: "+p.verifyCaducity()+"\n - Price before taxes: $"+ p.getPrice()+"\n - Total price (with tax): $"+p.getfinalPrice()); 
			System.out.println("------------------------");
		}
	}

}
