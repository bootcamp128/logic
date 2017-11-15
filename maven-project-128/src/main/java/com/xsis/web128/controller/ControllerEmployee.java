package com.xsis.web128.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	//receive data 
	// * save and back to main (redirect)
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String employee(@ModelAttribute Employee employee){
		employeeService.save(employee);
		return "redirect:/employee";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id){
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName("required");
		employeeService.delete(emp);
	}
	
	@ResponseBody
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Employee getEmployeeById(@PathVariable int id){
		Employee emp = employeeService.getEmployeeById(id);
		return emp;
	}
	
	//update
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody Employee emp){
		//employeeService.update(emp);
	}
}
