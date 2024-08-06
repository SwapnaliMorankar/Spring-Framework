package com.springcore.Beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Beanscope.prototype.Sample;
import com.springcore.Beanscope.singleton.Example;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        
//        Example ex1 = context.getBean("example", Example.class);
//        System.out.println(ex1);
//        System.out.println(ex1.hashCode());
//        System.out.println("------------------------------------------------------------------");
//        Example ex2 = context.getBean("example", Example.class);
//        System.out.println(ex2);
//        System.out.println(ex2.hashCode());
        
        Sample sm1 = context.getBean("sample", Sample.class);
        System.out.println(sm1);
        System.out.println(sm1.hashCode());
        System.out.println("------------------------------------------------------------------");
        Sample sm2 = context.getBean("sample", Sample.class);
        System.out.println(sm2);
        System.out.println(sm2.hashCode());
        System.out.println("------------------------------------------------------------------");
        Sample sm3 = context.getBean("sample", Sample.class);
        System.out.println(sm3);
        System.out.println(sm3.hashCode());
        
    }
}
