package com.springjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Employee;

public class RowMapperImple implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpID(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setPosition(rs.getString(3));
		return emp;
	}

}
