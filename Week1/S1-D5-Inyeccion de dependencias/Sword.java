package com.edgaritzak.herogenerator;

public class Sword implements Weapon {
	private int attackBonus;
	private int defenseBonus;
	
	public Sword() {
		attackBonus = 12;
		defenseBonus = 8;
	}
	@Override
	public String attack() {
		return "slashes with the sword. (Deals "+attackBonus+" damage)";
	}
	@Override
	public String defend() {
		return "blocks with the sword. (Blocks "+defenseBonus+" damage)";
	}
	@Override
	public String getWeaponName() {
		return "Sword";
	}
}
