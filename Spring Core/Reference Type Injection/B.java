package com.springcore.ref;

public class B {

	private int z;
	private int m;
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public B(int z, int m) {
		super();
		this.z = z;
		this.m = m;
	}
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "B [z=" + z + ", m=" + m + "]";
	}
	
	
}
