package com.springcore.autowiring.xml.bytype;

public class C {

	private String Name;
	private int ID;
	private D obj;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public D getObj() {
		return obj;
	}
	public void setObj(D obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "C [Name=" + Name + ", ID=" + ID + ", obj=" + obj + "]";
	}
	
	
}
