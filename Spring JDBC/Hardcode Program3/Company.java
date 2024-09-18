package com.springjdbc.entities;

public class Company {
	
	private int ID;
	private String Name;
	private String Location;
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
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	
	@Override
	public String toString() {
		return "Company [ID=" + ID + ", Name=" + Name + ", Location=" + Location + "]";
	}
	
	

}
