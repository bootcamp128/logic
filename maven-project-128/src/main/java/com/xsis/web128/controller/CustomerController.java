package com.xsis.web128.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xsis.web128.entity.Customer;
import com.xsis.web128.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping
	public String index(Model model){
		List<Customer> customers = customerService.getAllCustomers();
		model.addAttribute("customers", customers);
		return "customer";
	}
}
