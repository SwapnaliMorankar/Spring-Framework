package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.stereotype.annotations.Example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Example ex1 = context.getBean("example", Example.class);
        System.out.println(ex1);
        System.out.println(ex1.getAddress().getClass().getName());
    }
}
