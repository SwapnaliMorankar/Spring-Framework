package com.springcore.constrinject;

public class Certificate {

	String certiName;

	public Certificate(String certiName) {
		super();
		this.certiName = certiName;
	}

	@Override
	public String toString() {
		return "Certificate [certiName=" + certiName + "]";
	}



}
