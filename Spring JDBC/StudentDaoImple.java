package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entities.Student;

public class StudentDaoImple implements StudentDao {

	private JdbcTemplate jdbc;
	
	@Override
	public int insert(Student student) {
		String query = "insert into student(ID, Name, City) values(?, ? ,?)";
		int r = this.jdbc.update(query, student.getID(), student.getName() , student.getCity());
		return r;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	
	

}
