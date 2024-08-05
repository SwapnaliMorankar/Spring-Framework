package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.standalone.collection.Person;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Person person1 = (Person) context.getBean("p1");
        System.out.println(person1.getFriends());
        System.out.println(person1.getFees());
        System.out.println(person1.getProperty1());
    }
}
