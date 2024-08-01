package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowiring.xml.byname.A;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
    	A a2 = (A) context.getBean("a1");
    	System.out.println(a2);
    }
}
