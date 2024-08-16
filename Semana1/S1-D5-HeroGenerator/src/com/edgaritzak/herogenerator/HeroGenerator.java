package com.edgaritzak.herogenerator;

public class HeroGenerator {
	
	public static Hero generate(String name, String weapon ,int healthPoints) {
		if (weapon.equals("sword")) return new Hero(name, new Sword(),healthPoints);
		if (weapon.equals("shield")) return new Hero(name, new Shield(),healthPoints);
		if (weapon.equals("spellbook")) return new Hero(name, new Spellbook(),healthPoints);
		if (weapon.equals("bow")) return new Hero(name, new Bow(),healthPoints);
		throw new UnsupportedOperationException("Could not generate hero"); 
	}
	
}
