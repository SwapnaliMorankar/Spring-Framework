package com.springjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Company;

public class RowMapperImple implements RowMapper<Company> {

	@Override
	public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
		Company company1 = new Company();
		company1.setID(rs.getInt(1));
		company1.setName(rs.getString(2));
		company1.setLocation(rs.getString(3));
		return company1;
	}

}
