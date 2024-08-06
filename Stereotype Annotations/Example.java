package com.springcore.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example {

	@Value("Swapnali")
	private String StudentName;
	@Value("Pune")
	private String StudentCity;
	@Value("#{temp}")
	private List<String> Address;
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	
	public List<String> getAddress() {
		return Address;
	}
	public void setAddress(List<String> address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Example [StudentName=" + StudentName + ", StudentCity=" + StudentCity + ", Address=" + Address + "]";
	}
	
	
}
