package com.edgaritzak.herogenerator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Hero[] party = new Hero[]{
				HeroGenerator.generate("Ito", "sword", 8370),
				HeroGenerator.generate("Kondor", "bow", 7840),
				HeroGenerator.generate("Shauna ", "shield", 9999),
				HeroGenerator.generate("Krystallia", "spellbook", 7820)
			};
		
		for(Hero hero:party) {
			System.out.println(hero.toString());
			System.out.println(hero.attack());
			System.out.println(hero.defend());
			System.out.println("------------");
		}
	}
}
