package com.societegenerale.employeeportal.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.societegenerale.employeeportal.enums.Gender;
import com.societegenerale.employeeportal.model.Employee;
import com.societegenerale.employeeportal.service.EmployeeService;


@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

	@InjectMocks
	EmployeeController controller = new EmployeeController();

	@Mock
	EmployeeService employeeService;

	Employee employee = new Employee();
	List<Employee> listEmp = new ArrayList<>();
	@Before
	public void setUp() throws ParseException {
		MockitoAnnotations.initMocks(this);
		employee.setFirstName("muthukumaran");
		employee.setLastName("r");	
		employee.setGender(Gender.MALE);
		employee.setDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").parse("25-06-1987"));
		employee.setDepartment("ECE");
		listEmp.add(employee);
	}

	@Test
	public void createEmployeeTest() {
		Mockito.when(employeeService.createEmployee(employee)).thenReturn(employee);
		assertNotNull(employee);
		assertEquals(employee.getFirstName(),controller.createEmployee(employee).getFirstName());
	}

	@Test
	public void createEmployeeNullTest() {
		assertNotNull(employee);
		assertNull(controller.createEmployee(null));
	}

	@Test
	public void getAllEmployeeDetailsTest() {
		Mockito.when(employeeService.getAllEmployeeDetails()).thenReturn(listEmp);
		assertNotNull(listEmp);
		assertEquals(listEmp,controller.getAllEmployeeDetails());
	}

}