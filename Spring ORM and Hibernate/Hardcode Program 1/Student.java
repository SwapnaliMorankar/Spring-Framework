package com.springorm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@Column(name="ID")
	private int ID;
	@Column(name="Name")
	private String Name;
	@Column(name="City")
	private String City;
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
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Student(int iD, String name, String city) {
		super();
		ID = iD;
		Name = name;
		City = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", City=" + City + "]";
	}
	
	

}
