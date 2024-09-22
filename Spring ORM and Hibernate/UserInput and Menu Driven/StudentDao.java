package com.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entitites.Student;

public class StudentDao {
	
	private HibernateTemplate hibernatetemplate;

	//Insert
	@Transactional
	public int insert(Student student) {
		Integer output = (Integer)this.hibernatetemplate.save(student);
		return output;
	}
	
	//Read 1 row
	public Student getStudent(int ID) {
		Student student = this.hibernatetemplate.get(Student.class, ID);
		return student;
	}
	
	//Read all rows
	public List<Student> getAllStudents(){
		List<Student> students = this.hibernatetemplate.loadAll(Student.class);
		return students;
	}
	
	//Delete
	@Transactional
	public void deleteStudent(int ID) {
		Student student = this.hibernatetemplate.get(Student.class, ID);
		this.hibernatetemplate.delete(student);
	}
	
	//Update
	@Transactional
	public void updateStudent(Student student) {
		this.hibernatetemplate.update(student);
	}

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
	
	
	
}
