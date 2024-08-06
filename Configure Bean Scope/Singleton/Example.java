package com.springcore.Beanscope.singleton;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example {

	@Value("Swapnali")
	private String Name;
	@Value("46")
	private int Roll;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	@Override
	public String toString() {
		return "Example [Name=" + Name + ", Roll=" + Roll + "]";
	}
	
	
}
