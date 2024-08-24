package com.edgaritzak.pharmacyManagementSystem;

public class OralDrug extends Drug{
	private String tabletType; 
	
	public OralDrug(String name, double price, String tabletType) {
		super(name, price);
		this.tabletType = tabletType;
	}

	public String getTabletType() {
		return tabletType;
	}

	public void setTabletType(String tabletType) {
		this.tabletType = tabletType;
	}
}
