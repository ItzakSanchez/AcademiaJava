package com.edgaritzak.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//---------------ARRAYLIST--------------------
		
		List<String> names = new ArrayList<>(); //create list
		//add elements
		names.add("Edgar");
		names.add("Jose");
		names.add("Sofia");
		names.add("Vanesa");
		System.out.println(names); //show list
		
		names.remove(0); //remove "Edgar" from the list
		System.out.println(names); 
		System.out.println(names.get(1));//print "Sofia"
		
		
		//---------------LINKEDLIST--------------------
		
		LinkedList<String> lastname = new LinkedList<>();
		
		lastname.add("Johnson");
		lastname.addLast("Roberts");
		lastname.addFirst("Lee");
		lastname.addLast("Brown");		
		lastname.addLast("Harris");
		lastname.add(4,"Smith");
		System.out.println(lastname);//print last names
		
		
		lastname.removeFirst(); //remove Lee and Harris
		lastname.removeLast(); //print last names
		System.out.println(lastname);//print last names
		
		System.out.println(lastname.get(1));//print "Roberts"
		
		
		
		//---------------DEQUEUE--------------------
		
		Deque<String> lastname2 = new ArrayDeque<String>();
		
		lastname2.add("Johnson");
		lastname2.addFirst("Smith");
		lastname2.addFirst("Lee");
		lastname2.addLast("Roberts");
		lastname2.addLast("Brown");		
		lastname2.addLast("Harris");
		System.out.println(lastname2);//print last names
		
		
		lastname2.pollFirst(); //remove Lee 
		lastname2.pollLast(); //remove Harris 
		lastname2.addFirst("Sanchez"); //add "Sanchez" at first  
		System.out.println(lastname2);//print last names
		
		
		//---------------HASHSET--------------------

		HashSet<String> inventory = new HashSet<>();
		
		inventory.add("Grapes");
		inventory.add("Apples");
		inventory.add("Pears");
		inventory.add("Oranges");
		inventory.add("Banana");
		inventory.add("Watermelon");
		
		
		System.out.println("HashSet size: "+inventory.size()); //get HashSet size
		inventory.add("Apples");  //Attempts to add apples again but doesn't add to hashMap
		
		System.out.println("HashSet size: "+inventory.size()); //get HashSet size
		System.out.println(inventory);
		
		//---------------TREESET--------------------

		TreeSet<String> phoneNumbers = new TreeSet<String>(); //Create TreeSet
		
		//add numbers
		phoneNumbers.add("8126280959");
		phoneNumbers.add("8172714816");
		phoneNumbers.add("8159974499");
		phoneNumbers.add("8159212275");
		phoneNumbers.add("8172795045"); //contains this number
		phoneNumbers.add("8100298380");
		phoneNumbers.add("8157996990");
		phoneNumbers.add("8140279655");
		phoneNumbers.add("8113084918");
		
		System.out.println(phoneNumbers.contains("8172795045")); //Return if contains a number
		System.out.println(phoneNumbers.size()); //show size
		phoneNumbers.remove("8126280959"); //delete an item
		System.out.println(phoneNumbers.size()); //show size
		
		System.out.println(phoneNumbers); //Show sorted numbers
	
		
		//---------------HASHTABLE--------------------

		Hashtable<Integer, String> usernamesId = new Hashtable<>();
		usernamesId.put(1, "GtBolt");
		usernamesId.put(2, "TekSir");
		usernamesId.put(3, "DreamOmega");
		usernamesId.put(4, "CrazyHydro");
		usernamesId.put(5, "DevilBold");
	
		usernamesId.put(5, "New UserNames"); // add a value with a 5 as key, replace value
		usernamesId.remove(4); //removes "CrazyHydro"
		
		System.out.println(usernamesId.size()); //print size
		System.out.println(usernamesId.get(3)); //print DreamOmega
		System.out.println((usernamesId)); //print Hashtable
		
		
		//---------------HASHMAP--------------------
		HashMap<Integer, String> EmployeeList = new HashMap<>();
		
		EmployeeList.put(1, "Lorraine Donaldson");
		EmployeeList.put(2, "Nick Good");
		EmployeeList.put(3, "Emma Jordan");
		EmployeeList.put(4, "Stella Fields");
		EmployeeList.put(5, null); // allows null values

		EmployeeList.put(5, "Katherine Dodson"); // add a value with a 5 as key, replace value
		EmployeeList.remove(4); //removes "Stella Fields"
		
		System.out.println(EmployeeList.size()); //print size
		System.out.println(EmployeeList.get(3)); //Emma Jordan
		System.out.println((EmployeeList)); //print HashMap
		
	}

}
