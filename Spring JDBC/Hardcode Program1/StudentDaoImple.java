package com.springjdbc.dao;

import java.util.List;

import javax.swing.tree.RowMapper;

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
	
	//Select Query for one row
	@Override
	public Student getStudent(int ID) {
		String query="select * from student where ID=?";
		RowMapperImpl rowMapper = new RowMapperImpl();
		Student student = this.jdbc.queryForObject(query, rowMapper, ID);
		return student;
	}
	
	//Select All Data
	@Override
	public List<Student> getAllStudents() {
		String query = "select * from student";
		RowMapperImpl rowMapper1 = new RowMapperImpl();
		List<Student> students = this.jdbc.query(query, rowMapper1);
		return students;
	}
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	

}
