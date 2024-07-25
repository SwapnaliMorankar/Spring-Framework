package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");  
        Student student1 = (Student) context.getBean("student1");
        
        System.out.println("Successfull.........");
        System.out.println("The Data is :");
        System.out.println(student1);
    }
}
