package com.societegenerale.employeeportal.service;

import java.util.List;

import com.societegenerale.employeeportal.model.Employee;


public interface EmployeeService {

	public List<Employee> getAllEmployeeDetails();
	
	public Employee createEmployee(Employee emp);
}