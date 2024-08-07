package com.springcore.RemovingXml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Student {
	
	private Samosa s1;
	
	public Student(Samosa s1) {
		super();
		System.out.println("Entered constructor");
		this.s1 = s1;
	}

	public void study() {
		this.s1.display();
		System.out.println("Keep Reading");
	}

	@Override
	public String toString() {
		return "Successfull";
	}
	
	
	
}
