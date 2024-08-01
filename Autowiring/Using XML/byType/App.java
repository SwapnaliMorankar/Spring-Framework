package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowiring.xml.byname.A;
import com.springcore.autowiring.xml.bytype.C;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
    	
//    	By Name
//    	A a2 = (A) context.getBean("a1");
//    	System.out.println(a2);
    	
//    	By Type
    	C c2 = (C) context.getBean("c1");
    	System.out.println(c2);
    	
    	
    }
}
