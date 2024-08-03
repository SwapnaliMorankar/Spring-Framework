package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Sample {
	
	private int Roll;
	@Autowired
	private Example ex;
	
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public Example getEx() {
		return ex;
	}
	public void setEx(Example ex) {
		this.ex = ex;
	}

	public Sample() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sample(int roll, Example ex) {
		super();
		Roll = roll;
		this.ex = ex;
	}
	
	@Override
	public String toString() {
		return "Sample [Roll=" + Roll + ", ex=" + ex + "]";
	}
	
}
