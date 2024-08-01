package com.springcore.autowiring.xml.byname;

public class B {
	private String City;
	private int ID;
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String city) {
		City = city;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	@Override
	public String toString() {
		return "B [City=" + City + ", ID=" + ID + "]";
	}
	
	
}
