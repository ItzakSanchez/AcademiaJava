package com.edgaritzak.decoratorpattern;

public class Main {
	
	public static void main(String[] args) {
		Main app = new Main();
	    app.run(args);
	}
	
	 public void run(String[] args) {
		//Selling pizza
		MenuSeller menuSeller = new MenuSeller();
		menuSeller.makeOrder("Pepperoni", 2);
		
		//Sell pizza combo with decorator
		ComboMealDecorator ComboMeal  = new ComboMealDecorator(menuSeller);
		ComboMeal.setSide("Breadsticks");
		ComboMeal.setDrink("Coca-Cola 2L bottles, 67.6 Oz");
		ComboMeal.setDip("Ranch Dressing");
		ComboMeal.makeOrder("Supreme", 2);
		}    
}
