package com.edgaritzak.decoratorpattern.test;
import com.edgaritzak.decoratorpattern.*;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class test1 {

	@Test
	void test() {
		Assertions.assertEquals(1,1);
	}
	@Test
	public void ComboMealDecoratorTest() {
		
		MenuSeller menuSeller =new MenuSeller();
		ComboMealDecorator ComboMealDecorator = new ComboMealDecorator(menuSeller);

		ComboMealDecorator.setDip("dip");
		ComboMealDecorator.setDrink("drink");
		ComboMealDecorator.setSide("side");
		
		Assertions.assertEquals(ComboMealDecorator.getDip(),"dip");
		Assertions.assertEquals(ComboMealDecorator.getDrink(),"drink");
		Assertions.assertEquals(ComboMealDecorator.getSide(),"side");
		
		Assertions.assertEquals(ComboMealDecorator.makeOrder("Ham",1), "type:Ham quantity:1 side:side dip:dip drink:drink");
	}
	
	  @Test
	    public void testMain() {

	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        PrintStream originalOut = System.out;
	        System.setOut(new PrintStream(outputStream));

	        Main.main(new String[]{});
	        System.setOut(originalOut);


	        String output = outputStream.toString();
	        assertEquals("2 Pepperoni pizza\r\n"
	        		+ "You have ordered a combo, it includes:\r\n"
	        		+ "- 2 Supreme pizza\r\n"
	        		+ "Complements:\r\n"
	        		+ "- Side: Breadsticks\r\n"
	        		+ "- Dip: Ranch Dressing\r\n"
	        		+ "- Drink: Coca-Cola 2L bottles, 67.6 Oz", output.trim());
	    }
}
