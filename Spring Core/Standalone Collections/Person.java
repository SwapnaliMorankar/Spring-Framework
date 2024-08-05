package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List <String> Friends;
	private Map <String, Integer> Fees;
	private Properties property1;

	public List<String> getFriends() {
		return Friends;
	}

	public void setFriends(List<String> friends) {
		System.out.println("Setting friends");
		Friends = friends;
	}

	public Map<String, Integer> getFees() {
		return Fees;
	}

	public void setFees(Map<String, Integer> fees) {
		System.out.println("Setting fees");
		Fees = fees;
	}

	public Properties getProperty1() {
		return property1;
	}

	public void setProperty1(Properties property1) {
		System.out.println("Setting property");
		this.property1 = property1;
	}

	@Override
	public String toString() {
		return "Person [Friends=" + Friends + ", Fees=" + Fees + ", property1=" + property1 + "]";
	}

	
	
}
