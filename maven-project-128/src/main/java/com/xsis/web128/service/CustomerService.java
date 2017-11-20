package com.xsis.web128.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.web128.dao.CustomerDao;
import com.xsis.web128.dao.PenjualanDao;
import com.xsis.web128.entity.Customer;
import com.xsis.web128.entity.Penjualan;

@Service
@Transactional
public class CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	PenjualanDao penjualanDao;
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> listCustomer = customerDao.getAllCustomers();
		
		for(Customer customer : listCustomer){
			List<Penjualan> listPenjualan = 
					penjualanDao.getPenjualanByCustomer(customer);
			customer.setListPenjualan(listPenjualan);
		}
		
		
		return listCustomer;
	}

}
