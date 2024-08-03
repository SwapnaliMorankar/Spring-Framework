package com.springcore.autowiring.annotation;

public class Example {
	
	private int ID;
	private String Name;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Example(int iD, String name) {
		super();
		ID = iD;
		Name = name;
	}
	
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Example [ID=" + ID + ", Name=" + Name + "]";
	}
	
	
}
