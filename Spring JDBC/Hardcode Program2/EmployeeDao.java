package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entities.Employee;

public interface EmployeeDao {
	public int insert(Employee e1);
	public int change(Employee e1);
	public int delete(int EmpID);
	public Employee getEmployee(int EmpID);
	public List<Employee> getAllEmployees();
}
