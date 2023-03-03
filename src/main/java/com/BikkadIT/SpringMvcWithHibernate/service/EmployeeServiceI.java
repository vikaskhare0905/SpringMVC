package com.BikkadIT.SpringMvcWithHibernate.service;

import java.util.List; 

import com.BikkadIT.SpringMvcWithHibernate.model.Employee;

public interface EmployeeServiceI {

	public int saveEmployee(Employee emp);

	public List<Employee> getAllEmployees();
}