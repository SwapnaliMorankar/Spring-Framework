package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int ID);
	public Student getStudent(int ID);
	public List<Student> getAllStudents();
}
