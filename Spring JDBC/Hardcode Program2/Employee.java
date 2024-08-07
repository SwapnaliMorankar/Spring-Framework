package com.springjdbc.entities;

public class Employee {
	
	private int EmpID;
	private String Name;
	private String Position;
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empID, String name, String position) {
		super();
		EmpID = empID;
		Name = name;
		Position = position;
	}
	@Override
	public String toString() {
		return "Employee [EmpID=" + EmpID + ", Name=" + Name + ", Position=" + Position + "]";
	}
	
	
}
