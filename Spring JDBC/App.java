package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentDaoImple;
import com.springjdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");        
        StudentDao imple = (StudentDao) context.getBean("studentdao", StudentDao.class);
        
        Student stud1 = new Student();
        stud1.setID(666);
        stud1.setName("Harsh");
        stud1.setCity("Aurangabad");
        
        int output = imple.insert(stud1);
        System.out.println("Updated: "+ output);
    }
}
