package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome....." );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        A temp = (A) context.getBean("aref");
        
       System.out.println( "Successfull....." );
       System.out.println(temp);
       System.out.println(temp.getX());
       System.out.println(temp.getOb().getM());
       System.out.println(temp.getOb().getZ());
        
    }
}
