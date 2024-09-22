package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.dao.StudentDaoImple;
import com.springorm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        StudentDao student = context.getBean("StudentDao", StudentDaoImple.class);
        
        //Insert
        Student student1 = new Student(222, "Harsh", "Nagar");
        int output = student.insert(student1);
        System.out.println(output);
    }
}
