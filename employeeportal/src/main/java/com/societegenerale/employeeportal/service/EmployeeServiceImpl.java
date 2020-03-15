package com.societegenerale.employeeportal.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societegenerale.employeeportal.model.Employee;
import com.societegenerale.employeeportal.repository.EmployeeRepository;


/*--service class to implement business logic --*/

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepo;
	
	@Override
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> employeeList = employeeRepo.findAll();
		employeeList.sort(Comparator.comparing(Employee::getFirstName));
		return employeeList;
	}

	@Override
	public Employee createEmployee(Employee emp) {
		Employee employee =  null;
		if(Optional.ofNullable(emp).isPresent()) {
			employee = employeeRepo.save(emp);
		}
		return employee;
		
	}

}