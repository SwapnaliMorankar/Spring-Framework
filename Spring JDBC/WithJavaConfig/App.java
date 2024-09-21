package com.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.dao.BookDaoImple;
import com.springjdbc.entities.Book;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        BookDaoImple book1 = context.getBean("BookDao", BookDaoImple.class);
        Scanner sc = new Scanner(System.in);
        int ch=0;
        
        do {
        System.out.println("Choose the operation to be done: "
        		+ "\n 1. Insert \n 2. Update\n 3. Delete\n 4. Select 1\n 5. Select All\n 6. Exit");
        System.out.println("Enter: ");
        ch = sc.nextInt();
        
        switch(ch) {
        	case 1: 
        		//Insert
                Book b1 = new Book();
                System.out.println("Enter the details of book to be inserted: ");
                System.out.println("Enter ID: ");
                int id = sc.nextInt();
                b1.setID(id);
                System.out.println("Enter BookName: ");
                sc.nextLine();
                String name = sc.nextLine();
                b1.setBookname(name);
                System.out.println("Enter Genre of Book: ");
                String genre = sc.nextLine();
                b1.setGenre(genre);
                int output1 = book1.insert(b1);
                System.out.println("Book Inserted: "+ output1);
                break;
                
        	case 2: 
        		//Update
                Book b2 = new Book();
                System.out.println("Enter the ID of book to be updated: ");
                int id1 = sc.nextInt();
                b2.setID(id1);
                System.out.println("Enter updated BookName: ");
                sc.nextLine();
                String name1 = sc.nextLine();
                b2.setBookname(name1);
                System.out.println("Enter updated Genre of Book: ");
                String genre1 = sc.nextLine();
                b2.setGenre(genre1);
                int output2 = book1.change(b2);
                System.out.println("Book Updated: "+ output2);
                break;
                
        	case 3: 
        		//Delete
        		Book b3 = new Book();
        		System.out.println("Enter the ID of book to be deleted: ");
        		int id2 = sc.nextInt();
        		int output3 = book1.delete(id2);
        		System.out.println("Book Deleted: "+ output3);
                break;
                
        	case 4:
        		//Select 1
        		Book b4 = new Book();
        		System.out.println("Enter the ID of book to be shown: ");
        		int id3 = sc.nextInt();
        		Book output4 = book1.getBook(id3);
        		System.out.println("The Book details are:  \n" + output4);
        		break;
        		
        	case 5:
        		//Select 1
        		Book b5 = new Book();
        		List<Book> output5 = book1.getAllBooks();
        		System.out.println("The Books details are:");
        		for (Book x: output5) {
        			System.out.println("ID: " + x.getID());
        			System.out.println("Bookname: " + x.getBookname());
        			System.out.println("Genre: " + x.getGenre());
        		}
        		break;
                
        	case 6:
        		//Exit Condition
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        		
        	}
        }
        while(ch!=6);

        sc.close();
    }
}
