package com.xsis.web128.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.web128.dao.EmployeeDao;
import com.xsis.web128.entity.Employee;

@Transactional
@Component
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public void save(Employee employee){
		employeeDao.save(employee);
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployees();
	}

	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.delete(emp);
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
	}

	public void update(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.update(emp);
	}
	
}
