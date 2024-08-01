package com.springcore.autowiring.xml.byname;

public class A {
	private String Name;
	private int Rollno;
	private B obj;
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getRollno() {
		return Rollno;
	}
	
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	
	public B getObj() {
		return obj;
	}
	
	public void setObj(B obj) {
		this.obj = obj;
	}
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public A(String name, int rollno, B obj) {
		super();
		Name = name;
		Rollno = rollno;
		this.obj = obj;
	}
	
	@Override
	public String toString() {
		return "A [Name=" + Name + ", Rollno=" + Rollno + ", obj=" + obj + "]";
	}
	
	
}
