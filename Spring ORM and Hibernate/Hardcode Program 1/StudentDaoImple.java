package com.springorm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entities.Student;

public class StudentDaoImple implements StudentDao {
	
	private HibernateTemplate hibernatetemplate;

	@Override
	@Transactional
	public int insert(Student student) {
		int result = (Integer) this.hibernatetemplate.save(student);
		return result;
	}

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	
}
