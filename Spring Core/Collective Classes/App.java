package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcomeeeeeee......!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        
        System.out.println("Successfull......!");
        System.out.println("The Data is......!" + employee1); 
    }
}
