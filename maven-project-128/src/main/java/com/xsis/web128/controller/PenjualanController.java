package com.xsis.web128.controller;

import java.util.List;
import java.util.Locale;

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

import com.xsis.web128.entity.Customer;
import com.xsis.web128.entity.Penjualan;
import com.xsis.web128.service.CustomerService;
import com.xsis.web128.service.PenjualanService;

@Controller
@RequestMapping("/penjualan")
public class PenjualanController {

	@Autowired
	PenjualanService penjualanService;
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping
	public String index(Model model){
		List<Penjualan> listPenjualan = penjualanService.getAllPenjualan();
		List<Customer> customers = customerService.getAllCustomers();
		model.addAttribute("listPenjualan", listPenjualan);
		model.addAttribute("customers", customers);
		return "penjualan";
	}	
	
	@RequestMapping(value = "/get/{id}", method=RequestMethod.GET)
	@ResponseBody
	public Penjualan getPenjualanById(@PathVariable int id){
		Penjualan penjualan = penjualanService.getPenjualanById(id);
		
		return penjualan;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void edit(@RequestBody Penjualan penjualan){
		penjualanService.update(penjualan);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute Penjualan penjualan){
		penjualanService.save(penjualan);
		return "redirect:/penjualan";
	}
}
