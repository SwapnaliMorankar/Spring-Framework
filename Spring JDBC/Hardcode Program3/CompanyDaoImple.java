package com.springjdbc.dao;

import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Company;
import com.springjdbc.mapper.RowMapperImple;

public class CompanyDaoImple implements CompanyDao {
	
	public JdbcTemplate jdbc;

	@Override
	public int insert(Company company) {
		String query = "Insert into Company(ID, Name, Location) values(?, ?, ?)";
		int result = this.jdbc.update(query, company.getID(), company.getName(), company.getLocation());
		return result;
	}

	@Override
	public int change(Company company) {
		String query = "Update company set Name=?, Location=? where ID=?";
		int result = this.jdbc.update(query, company.getName(), company.getLocation(), company.getID());
		return result;
	}

	@Override
	public int delete(int ID) {
		String query = "Delete from company where ID=?";
		int result = this.jdbc.update(query, ID);
		return result;
	}

	@Override
	public Company getCompany(int ID) {
		String query = "Select * from company where ID=?";
		RowMapper<Company> rowmapper = new RowMapperImple();
		Company company = this.jdbc.queryForObject(query, rowmapper, ID);
		return company;
	}

	@Override
	public List<Company> getAllCompany() {
		String query = "Select * from company";
		RowMapper<Company> rowmapper1 = new RowMapperImple();
		List<Company> company = this.jdbc.query(query, rowmapper1);
		return company;
	}

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	

}
