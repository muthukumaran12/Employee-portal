package com.societegenerale.employeeportal.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
import com.societegenerale.employeeportal.repository.EmployeeRepository;


@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {
	
	@InjectMocks
	EmployeeServiceImpl service = new EmployeeServiceImpl();

	@Mock
	EmployeeRepository employeeRepo;

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
		Mockito.when(employeeRepo.save(employee)).thenReturn(employee);
		assertNotNull(employee);
		assertNotNull(service.createEmployee(employee));
		assertEquals("muthukumaran", service.createEmployee(employee).getFirstName());
	}

	@Test
	public void getAllEmployeeDetailsTest() {
		Mockito.when(employeeRepo.findAll()).thenReturn(listEmp);
		assertNotNull(listEmp);
		assertEquals(listEmp,service.getAllEmployeeDetails());
	}
}