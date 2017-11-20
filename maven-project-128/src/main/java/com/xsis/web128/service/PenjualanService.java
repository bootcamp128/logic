package com.xsis.web128.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.web128.dao.PenjualanDao;
import com.xsis.web128.entity.Penjualan;

@Service
@Transactional
public class PenjualanService {

	@Autowired
	private PenjualanDao penjualanDao;

	public List<Penjualan> getAllPenjualan() {
		// TODO Auto-generated method stub
		return penjualanDao.getAllPenjualan();
	}

	public Penjualan getPenjualanById(int id) {
		// TODO Auto-generated method stub
		return penjualanDao.getPenjualanById(id);
	}

	public void update(Penjualan penjualan) {
		// TODO Auto-generated method stub
		penjualanDao.update(penjualan);
	}

	public void save(Penjualan penjualan) {
		// TODO Auto-generated method stub
		penjualanDao.save(penjualan);
	}

	
}
