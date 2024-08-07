package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entities.Student;

public class StudentDaoImple implements StudentDao {

	private JdbcTemplate jdbc;
	
	//Insert Query
	@Override
	public int insert(Student student) {
		String query = "insert into student(ID, Name, City) values(?, ? ,?)";
		int r = this.jdbc.update(query, student.getID(), student.getName() , student.getCity());
		return r;
	}
	
	//Update Query
	@Override
	public int change(Student student) {
		String query = "update student set Name=?, City = ? where ID=?";
		int r = this.jdbc.update(query, student.getName(), student.getCity(), student.getID());
		return r;
	}
	
	//Delete Query
	@Override
	public int delete(int ID) {
		String query = "delete from student where ID=?";
		int r = this.jdbc.update(query, ID);
		return r;
	}

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

}
