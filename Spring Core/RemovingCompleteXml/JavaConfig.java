package com.springcore.RemovingXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.RemovingXml")
public class JavaConfig {

	@Bean
	public Samosa getsamosa() {
		Samosa s1 = new Samosa();
		return s1;
	}
	
	@Bean
	public Student getstudent() {
		Student stud1 = new Student(getsamosa());
		return stud1;
	}
}
