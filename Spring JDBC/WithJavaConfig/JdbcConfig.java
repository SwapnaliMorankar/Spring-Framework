package com.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.dao.BookDaoImple;

@Configuration
public class JdbcConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDriverManager() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("");
		ds.setUsername("");
		ds.setPassword("");
		
		return ds;
	}
	
	@Bean("jdbctemplate")
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbc = new JdbcTemplate();
		jdbc.setDataSource(getDriverManager());
		return jdbc;
		
	}

	@Bean("BookDao")
	public BookDaoImple getBook() {
		
		BookDaoImple book = new BookDaoImple();
		book.setJdbc(getTemplate());
		return book;
	}
	
}
