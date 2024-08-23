package com.edgaritzak.interfacefunctional;

public class Student {
	private static int count =0;
	
	private int id;
	private String name;
	private String lastname;
	private double score;
	
	public Student() {
		
	}
	
	public Student(String name, String lastname, double score) {
		id = count++;
		this.name = name;
		this.lastname = lastname;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
	
}
