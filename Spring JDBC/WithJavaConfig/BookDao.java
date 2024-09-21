package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entities.Book;

public interface BookDao {
	
	public int insert(Book book);
	public int change(Book book);
	public int delete(int ID);
	public Book getBook(int ID);
	public List<Book> getAllBooks();

}
