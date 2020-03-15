package com.societegenerale.employeeportal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.societegenerale.employeeportal.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}