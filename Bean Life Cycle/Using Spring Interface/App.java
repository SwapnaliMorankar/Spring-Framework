package com.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.lifecycleinterface.Read;
import com.springcore.lifecyclexml.Learn;


public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
    	
    	//Registering shut down hook is necessary to call destroy method
        //It is present in AbstractApplicationContext
        context.registerShutdownHook();
    	
        //Using XML
        Learn l1 = (Learn) context.getBean("learn1");
        double New = l1.getPrice();
        System.out.println(l1);
        System.out.println(New);

        //Using Interfaces
        Read r1 = (Read) context.getBean("read1");
        double Old = r1.getPrice();
        System.out.println(r1);
        System.out.println(Old);
        
    }
}
