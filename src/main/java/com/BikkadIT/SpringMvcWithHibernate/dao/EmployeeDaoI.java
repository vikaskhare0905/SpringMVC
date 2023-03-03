package com.BikkadIT.SpringMvcWithHibernate.dao;

import java.util.List;

import com.BikkadIT.SpringMvcWithHibernate.model.Employee;

public interface EmployeeDaoI {

	public int saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();
}