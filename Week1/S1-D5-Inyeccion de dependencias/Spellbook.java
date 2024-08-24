package com.edgaritzak.herogenerator;

public class Spellbook implements Weapon {
	private int attackBonus;
	private int defenseBonus;
	
	public Spellbook() {
		attackBonus = 22;
		defenseBonus = 1;
	}
	@Override
	public String attack() {
		return "casts a spell (Deals "+attackBonus+" damage)";
	}
	@Override
	public String defend() {
		return "creates a magical barrier. (Blocks "+defenseBonus+" damage)";
	}
	@Override
	public String getWeaponName() {
		return "Spellbook";
	}
}
