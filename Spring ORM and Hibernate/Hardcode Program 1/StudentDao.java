package com.springorm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entities.Student;

public interface StudentDao {
	
	@Transactional
	public int insert(Student student);

}
