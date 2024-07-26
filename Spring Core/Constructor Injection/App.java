package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.constrinject.Certificate;
import com.springcore.constrinject.Person; 

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
       Person p = (Person) context.getBean("person");
       System.out.println("Successfull......");
       System.out.println(p);
//       Certificate c = (Certificate) context.getBean("certificate");
//       System.out.println("Successfull......");
//       System.out.println(c);
       
    }
}
