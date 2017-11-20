package com.xsis.web128.dao;

import java.util.List;

import com.xsis.web128.entity.Customer;
import com.xsis.web128.entity.Penjualan;

public interface PenjualanDao {

	List<Penjualan> getAllPenjualan();

	List<Penjualan> getPenjualanByCustomer(Customer customer);

	Penjualan getPenjualanById(int id);

	void update(Penjualan penjualan);

	void save(Penjualan penjualan);

}
