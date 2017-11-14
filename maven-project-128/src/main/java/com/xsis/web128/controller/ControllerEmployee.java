package com.xsis.web128.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xsis.web128.entity.Employee;
import com.xsis.web128.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class ControllerEmployee {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping
	public String index(Model model){
		List<Employee> employees = employeeService.getAllEmployees();
		
		model.addAttribute("employees", employees);
		return "employee";
	}
	
	//receive data save
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseBody
	public Employee employee(@ModelAttribute Employee employee){
		employeeService.save(employee);
		return employee;
	}
}
