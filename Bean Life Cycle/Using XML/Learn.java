package com.springcore.lifecycle;

public class Learn {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Learn() {
		super();
		System.out.println("Object Created");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Learn [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	
}
