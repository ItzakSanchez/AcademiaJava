package com.edgaritzak.herogenerator;

public class Bow implements Weapon {
	private int attackBonus;
	private int defenseBonus;
	
	public Bow() {
		attackBonus = 17;
		defenseBonus = 4;
	}
	@Override
	public String attack() {
		return "shoots an arrow (Deals "+attackBonus+" damage)";
	}
	@Override
	public String defend() {
		return "blocks with the bow. (Blocks "+defenseBonus+" damage)";
	}
	@Override
	public String getWeaponName() {
		return "Bow";
	}

}
