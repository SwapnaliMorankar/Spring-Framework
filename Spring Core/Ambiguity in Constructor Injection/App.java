package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ambiguity.Addition;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcomeee!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Addition add= (Addition) context.getBean("add");
        System.out.println( "Successfull!" );
        add.dosum();
    }
}
