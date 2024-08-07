package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.dao.EmployeeDaoImple;
import com.springjdbc.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        EmployeeDao employee1 = (EmployeeDao) context.getBean("employeedao", EmployeeDaoImple.class);
        
        //Insert
        Employee em1 = new Employee();
        em1.setEmpID(200);
        em1.setName("Akshay");
        em1.setPosition("Software Engineer");
        int result1 = employee1.insert(em1);
        System.out.println("Inserted" + result1);
        
        //Insert
        Employee em3 = new Employee();
        em3.setEmpID(201);
        em3.setName("Tejas");
        em3.setPosition("Accounts Head");
        int result4 = employee1.insert(em3);
        System.out.println("Inserted" + result4);
        
        //Update
        Employee em2 = new Employee();
        em2.setEmpID(200);
        em2.setName("Suraj");
        em2.setPosition("Consultant");
        int result2 = employee1.change(em2);
        System.out.println("Updated" + result2);
        
        //Delete
        int result3 = employee1.delete(201);
        System.out.println("Deleted" + result3);
        
        //Select 1 row
        Employee empl = employee1.getEmployee(200);
        System.out.println("Selected Row: "+ empl);
        
        //Select all rows
        List<Employee> emp2 = employee1.getAllEmployees();
        for (Employee e:emp2) {
        	System.out.println(e);
        }
        
    }
}
