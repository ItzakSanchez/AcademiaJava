package com.edgaritzak.pharmacyManagementSystem;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		//Create HashMap
	    Map<Drug, Integer> inventory1 = new HashMap<>();
	    //Fill HashMap
	    Main.addDrugsToHashMap(inventory1, 1);
	    //Create Franchise
	    FranchiseLocation Franchise1 = new FranchiseLocation("Austin, Texas","5678 Maple Avenue, Austin, TX 73301",inventory1);
	    
        Franchise1.getInventory().entrySet().stream() //Create a stream
	    	.filter(x -> x.getKey().getClass().getSimpleName().equals("InjectableDrug")) // filter InjectableDrug from Franchise1
	    	.filter(x->x.getKey().getName().endsWith("n")) // filter drugs that ends with n from Franchise1
	    	.peek(x->x.setValue(x.getValue()+421)) // add 421 units to stocks
	    	.peek(x-> {if(x.getValue()>800)x.getKey().setPrice(x.getKey().getPrice()*0.50);}) // if stock is grater than 800, apply 50 percent discount
	    	.forEach(e -> Franchise1.getInventory().putIfAbsent(e.getKey(), e.getValue())); //update Franchise1 inventory from stream
	    
        //Print inventory from Franchise1
        System.out.println("--------------------------------------------");
	    Franchise1.getInventory().forEach((k, v) -> System.out.println("Drug Name:"+k.getName()+ "	|Price:"+ String.format("%.2f", k.getPrice())+"	|Stock:"+v));
	    System.out.println("--------------------------------------------");
	    //Print count of products and total stock
	    System.out.println("Count: "+Franchise1.getInventory().entrySet().stream().count()+
	    		"				|TotalStock:"+Franchise1.getInventory().values()
	    											.stream()
	    											.mapToInt(n -> n.intValue()).sum());

	}
	
	
	public static void addDrugsToHashMap(Map<Drug, Integer> hMap, int list) {
		InjectableDrug drug1 = new InjectableDrug("Aspirin", 12.99f, "Standard");
        InjectableDrug drug2 = new InjectableDrug("Penicillin", 25.50f, "Auto-Inject");
        InjectableDrug drug3 = new InjectableDrug("Insulin", 40.75f, "Standard");
        InjectableDrug drug4 = new InjectableDrug("Morphine", 60.00f, "Auto-Inject");
        InjectableDrug drug5 = new InjectableDrug("Epinephrine", 15.80f, "Standard");
        InjectableDrug drug6 = new InjectableDrug("Hydrocodone", 35.20f, "Auto-Inject");
        InjectableDrug drug7 = new InjectableDrug("Adrenaline", 22.45f, "Standard");
        InjectableDrug drug8 = new InjectableDrug("Tetanus Toxoid", 18.00f, "Auto-Inject");
        InjectableDrug drug9 = new InjectableDrug("Hepatitis B Vaccine", 55.10f, "Standard");
        InjectableDrug drug10 = new InjectableDrug("Rabies Vaccine", 80.25f, "Auto-Inject");
        OralDrug drug11 = new OralDrug("Aspirin", 9.99, "Extended-Release Tablet");
	    OralDrug drug12 = new OralDrug("Ibuprofen", 12.49, "Chewable Tablet");
	    OralDrug drug13 = new OralDrug("Paracetamol", 7.99, "Regular Tablet");
	    OralDrug drug14 = new OralDrug("Vitamin C", 14.99, "Sublingual Tablet");
	    OralDrug drug15 = new OralDrug("Antacid", 8.49, "Effervescent Tablet");
	    OralDrug drug16 = new OralDrug("Cough Syrup", 11.29, "Liquid Tablet");
	    OralDrug drug17 = new OralDrug("Allergy Relief", 13.59, "Extended-Release Tablet");
	    OralDrug drug18 = new OralDrug("Cold Medicine", 10.99, "Chewable Tablet");
	    OralDrug drug19 = new OralDrug("Digestive Aid", 6.99, "Regular Tablet");
	    OralDrug drug20 = new OralDrug("Sleep Aid", 15.49, "Extended-Release Tablet");
	    
	    if (list == 1) {
	    	hMap.put(drug1, 200);
	    	hMap.put(drug2, 300);
	    	hMap.put(drug3, 500);
	    	hMap.put(drug4, 100);
	    	hMap.put(drug5, 90);
	    	hMap.put(drug11, 780);
	    	hMap.put(drug12, 410);
	    	hMap.put(drug13, 640);
	    	hMap.put(drug14, 190);
	    	hMap.put(drug15, 210);
	    }
	    if (list == 2){
	    	hMap.put(drug6, 129);
	    	hMap.put(drug7, 237);
	    	hMap.put(drug8, 314);
	    	hMap.put(drug9, 150);
	    	hMap.put(drug10, 378);
	    	hMap.put(drug16, 205);
	    	hMap.put(drug17, 82);
	    	hMap.put(drug18, 365);
	    	hMap.put(drug19, 296);
	    	hMap.put(drug20, 190);
	    }
	}
}
