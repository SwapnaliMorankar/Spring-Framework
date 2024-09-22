package com.springorm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entitites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hellooooo...!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        StudentDao student = context.getBean("StudentDao", StudentDao.class);
        Scanner sc = new Scanner(System.in);
        int ch=0;
        do {
        	System.out.println("1. Add new student");
        	System.out.println("2. Display all students");
        	System.out.println("3. Get detail of single student");
        	System.out.println("4. Update student details");
        	System.out.println("5. Delete a student");
        	System.out.println("6. Exit Application");
        	System.out.println("Enter Your choice: ");
        	ch = sc.nextInt();
        	
        	switch(ch) {
        	
	        	case 1: 
	        		System.out.println("Enter ID of student to be inserted: ");
	        		int id = sc.nextInt();
	        		System.out.println("Enter Name of student to be inserted: ");
	        		sc.nextLine();
	        		String name = sc.nextLine();
	        		System.out.println("Enter City of student to be inserted: ");
	        		String city = sc.nextLine();
	        		Student student1 = new Student(id, name, city);
	                int result= student.insert(student1);
	                System.out.println("Inserted: "+ result);
	                break;
	                
	        	case 2:
	        		System.out.println("Data of all students is as follows: ");
	        		List<Student> studnets = student.getAllStudents();
	                for (Student x: studnets) {
	                	System.out.println(x);
	                }
	                break;
	                
	        	case 3:
	        		System.out.println("Enter ID of student to be displayed: ");
	        		int id1 = sc.nextInt();
	        		Student student2 = student.getStudent(id1);
	        		System.out.println("Data of the student is:" + student2);
	        		break;
	        		
	        	case 4:
	        		System.out.println("Enter ID of student to be updated: ");
	        		int id2 = sc.nextInt();
	        		System.out.println("Enter Name of student to be updated: ");
	        		sc.nextLine();
	        		String name1 = sc.nextLine();
	        		System.out.println("Enter City of student to be updated: ");
	        		String city1 = sc.nextLine();
	        		Student student3 = student.getStudent(id2);
	        		student.updateStudent(student3);
	        		System.out.println("Updated");
	        		break;
	        		
	        	case 5: 
	        		System.out.println("Enter ID of student to be deleted: ");
	        		int id3 = sc.nextInt();
	        		student.deleteStudent(id3);
	        		System.out.println("Deleted");
	        		break;
	        		
	        	case 6: 
	        		System.out.println("Thank You!");
	        		System.out.println("Exiting....");
	        		break;
	        		
	        	default: 
	        		System.out.println("Sorry! Wrong Input...");
        	}
        	
        }while(ch!=6);


    }
}
