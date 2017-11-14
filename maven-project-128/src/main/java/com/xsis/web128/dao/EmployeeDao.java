package com.xsis.web128.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xsis.web128.entity.Employee;


public interface EmployeeDao {

	//save
	public void save(Employee employee);
	//update
	//delete
	//read
	public List<Employee> getAllEmployees();
}
