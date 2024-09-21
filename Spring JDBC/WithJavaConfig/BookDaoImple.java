package com.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springjdbc.mapper.RowMapperImple;

import com.springjdbc.entities.Book;

public class BookDaoImple implements BookDao {
	
	JdbcTemplate jdbc;

	@Override
	public int insert(Book book) {
		String query = "Insert into Book(ID, Bookname, Genre) values(?,?,?)";
		int result = this.jdbc.update(query, book.getID(), book.getBookname(), book.getGenre());
		return result;
	}

	@Override
	public int change(Book book) {
		String query = "update Book set Bookname=?, Genre = ? where ID=?";
		int result = this.jdbc.update(query, book.getBookname(), book.getGenre(),  book.getID());
		return result;
	}

	@Override
	public int delete(int ID) {
		String query = "delete from book where ID=?";
		int result = this.jdbc.update(query, ID);
		return result;
	}

	@Override
	public Book getBook(int ID) {
		String query = "Select * from book where ID=?";
		RowMapper<Book> rowmapper = new RowMapperImple();
		Book book = this.jdbc.queryForObject(query, rowmapper, ID);
		return book;
	}

	@Override
	public List<Book> getAllBooks() {
		String query = "Select * from book";
		RowMapper<Book> rowmapper = new RowMapperImple();
		List<Book> book = this.jdbc.query(query, rowmapper);
		return book;
	}

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	
	

}
