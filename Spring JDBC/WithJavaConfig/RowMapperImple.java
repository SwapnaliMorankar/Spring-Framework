package com.springjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Book;

public class RowMapperImple implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setID(rs.getInt(1));
		book.setBookname(rs.getString(2));
		book.setGenre(rs.getString(3));
		return book;
	}

}
