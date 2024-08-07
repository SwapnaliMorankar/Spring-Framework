package com.springjdbc;

import java.util.List;

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
        
        //Insert
        Student stud1 = new Student();
        stud1.setID(110);
        stud1.setName("Yash");
        stud1.setCity("Beed");
        int output1 = imple.insert(stud1);
        System.out.println("Inserted: "+ output1);
        
        //Update
        Student stud2 = new Student();
        stud2.setID(222);
        stud2.setName("Swapnali");
        stud2.setCity("Pune");
        int output2 = imple.change(stud2);
        System.out.println("Updated: "+ output2);
        
        //Select one row
        Student output3 = imple.getStudent(666);
        System.out.println("Output: "+ output3);
        
        //Select all rows
        List<Student> output4 = imple.getAllStudents();
        for (Student s: output4) {
        System.out.println(s);
        }
        
        //Delete
        int output5 = imple.delete(514);
        System.out.println("Deleted: "+ output5);
    }
}
