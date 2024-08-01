package com.springcore.lifecycleannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private String Subject;

	public String getSubject() {
		System.out.println("Setting Subject name");
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public Example() {
		super();
		System.out.println("Object Created");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [Subject=" + Subject + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean Initialzed Welcomeeeeeeee");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean Destroyed Byeeeeeeeeeee");
	}
}
