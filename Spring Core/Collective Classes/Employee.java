package com.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int empID;
	private String empName;
	private List<String> phones;
	private Set<String> Address;
	private Map<String, String> Courses;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return Address;
	}
	public void setAddress(Set<String> address) {
		Address = address;
	}
	public Map<String, String> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}
	public Employee(int empID, String empName, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.phones = phones;
		Address = address;
		Courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nEmployee [empID=" + empID + ", \nempName=" + empName + ", \nphones=" + phones + ", \nAddress=" + Address
				+ ", \nCourses=" + Courses + "]";
	}
	
}
