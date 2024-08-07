package com.springcore.RemovingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class); 
        Student st1 = context.getBean("getstudent", Student.class);
        System.out.println(st1);
        st1.study();
    }
}
