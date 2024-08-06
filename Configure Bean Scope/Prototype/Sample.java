package com.springcore.Beanscope.prototype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Sample {

	@Value("Aabha")
	private String Name;
	@Value("01")
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
		return "Sample [Name=" + Name + ", Roll=" + Roll + "]";
	}
	
}
