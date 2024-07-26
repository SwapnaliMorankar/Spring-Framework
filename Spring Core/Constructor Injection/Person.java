package com.springcore.constrinject;

import java.util.List;

public class Person {

	private int personId;
	private String personName;
	private Certificate certi;
	private List<String> city;
	
	public Person(int personId, String personName, Certificate certi, List<String> city) {
		this.personId = personId;
		this.personName = personName;
		this.certi = certi;
		this.city = city;
	}

	@Override
	public String toString() {
		return "\nPerson Id is " + this.personId + "\nPerson Name is " + this.personName + 
				"\nCertificates: " + this.certi + "\n List of Cities: " + this.city;
	}
	

}
