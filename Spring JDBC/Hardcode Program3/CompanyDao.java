package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entities.Company;

public interface CompanyDao {
	
	public int insert(Company company);
	public int change(Company company);
	public int delete(int ID);
	public Company getCompany(int ID);
	public List<Company> getAllCompany();
}
