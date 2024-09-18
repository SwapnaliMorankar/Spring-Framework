package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.CompanyDao;
import com.springjdbc.dao.CompanyDaoImple;
import com.springjdbc.entities.Company;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        CompanyDao companydao = context.getBean("DaoImple", CompanyDaoImple.class);
        
        //Insert
        Company c1 = new Company();
        c1.setID(222);
        c1.setName("Deloitee");
        c1.setLocation("Bangalore");
        int output1 = companydao.insert(c1);
        System.out.println("Inserted: "+output1);
        
        //Update
        Company c2 = new Company();
        c2.setID(222);
        c2.setName("Deutsche");
        c2.setLocation("Mumbai");
        int output2 = companydao.change(c2);
        System.out.println("Updated: "+output2);
        
        //Delete
        int output3 = companydao.delete(111);
        System.out.println("Deleted: "+ output3);
        
        //Select 1
        Company company1 = companydao.getCompany(222);
        System.out.println("Selected Row: " + company1);
        
        //Select All
        List<Company> company2 = companydao.getAllCompany();
        for (Company x : company2) {
        	System.out.println(x);
        }
    }
}
