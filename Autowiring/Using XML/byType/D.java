package com.springcore.autowiring.xml.bytype;

public class D {

	private int Roll;
	private String City;
	
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "D [Roll=" + Roll + ", City=" + City + "]";
	}
	
	
}
