package com.edgaritzak.pharmacyManagementSystem;

public class InjectableDrug extends Drug{
	private String syringeType;
	
	public InjectableDrug(String name, double price,String syringeType) {
		super(name, price);
		this.syringeType = syringeType;
	}

	public String getSyringeType() {
		return syringeType;
	}

	public void setSyringeType(String syringeType) {
		this.syringeType = syringeType;
	}
}
