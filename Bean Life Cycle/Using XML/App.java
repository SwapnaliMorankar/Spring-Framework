package com.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.lifecycle.Learn;


public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Learn l1 = (Learn) context.getBean("learn1");
        
        //Registering shut down hook is necessary to call destroy method
        //It is present in AbstractApplicationContext
        context.registerShutdownHook();
        
        double New = l1.getPrice();
        System.out.println(l1);
        System.out.println(New);
    }
}
