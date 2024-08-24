package com.edgaritzak.herogenerator;

public class Hero {
	private String name;
	private Weapon weapon;
	private int healthPoints;
	
	public Hero(String name, Weapon weapon, int healthPoints) {
		this.name = name;
		this.weapon = weapon;
		this.healthPoints = healthPoints;
	}
	
	public String attack() {
		return name+" "+weapon.attack();
	}
	public String defend() {
		return name+" "+weapon.defend();
	}
	
	@Override
	public String toString() {
		return "Hero [name=" + name + ", healthPoints=" + healthPoints + ", weapon=" + weapon + "]";
	}

	public String getWeaponName() {
		return weapon.getWeaponName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	
	
}
