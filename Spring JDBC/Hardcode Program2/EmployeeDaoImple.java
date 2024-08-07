package com.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Employee;
import com.springjdbc.mapper.RowMapperImple;

public class EmployeeDaoImple implements EmployeeDao {
	
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public int insert(Employee e1) {
		String query = "insert into employee (EmpID, Name, Position) values(?,?,?)";
		int emp1 = this.jdbc.update(query, e1.getEmpID(), e1.getName(), e1.getPosition());
		return emp1;
	}

	@Override
	public int change(Employee e1) {
		String query = "update employee set Name=?, Position=? where EmpID=?";
		int emp1 = this.jdbc.update(query,e1.getName(), e1.getPosition(), e1.getEmpID());
		return emp1;
	}

	@Override
	public int delete(int EmpID) {
		String query = "delete from employee where EmpID=?";
		int emp1 = this.jdbc.update(query, EmpID);
		return emp1;
	}

	@Override
	public Employee getEmployee(int EmpID) {
		String query = "select * from employee where EmpID=?";
		RowMapper<Employee> rowMapper = new RowMapperImple();
		Employee employee = this.jdbc.queryForObject(query, rowMapper, EmpID);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		String query = "select * from employee";
		RowMapper<Employee> rowMapper = new RowMapperImple();
		List<Employee> employee = this.jdbc.query(query, rowMapper);
		return employee;
	}

}
