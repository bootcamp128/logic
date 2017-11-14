package com.xsis.web128.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xsis.web128.entity.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(emp);
		session.flush();
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		//HQL -> Hibernate Query Language
		String hql = "from Employee";
		List<Employee> employees = session.createQuery(hql).list();
		if(employees.isEmpty()){
			return null;
		}
		return employees;
	}
}
