package com.edgaritzak.herogenerator;

public class Shield implements Weapon {
	private int attackBonus;
	private int defenseBonus;
	
	public Shield() {
		attackBonus = 3;
		defenseBonus = 20;
	}
	@Override
	public String attack() {
		return "pushes the enemy with the shield (Deals "+attackBonus+" damage)";
	}
	@Override
	public String defend() {
		return "blocks with the shield. (Blocks "+defenseBonus+" damage)";
	}
	@Override
	public String getWeaponName() {
		return "Shield";
	}
}
