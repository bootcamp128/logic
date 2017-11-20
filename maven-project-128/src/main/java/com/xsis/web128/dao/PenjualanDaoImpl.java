package com.xsis.web128.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xsis.web128.entity.Customer;
import com.xsis.web128.entity.Penjualan;

@Repository
public class PenjualanDaoImpl implements PenjualanDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Penjualan> getAllPenjualan() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Penjualan> listPenjualan = 
				session.createCriteria(Penjualan.class).list();
		return listPenjualan;
	}

	public List<Penjualan> getPenjualanByCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
	String hql = "from Penjualan p where p.customer.id = :customer";
	
	List<Penjualan> listPenjualan = 
	session.createQuery(hql).
		setParameter("customer", customer.getId()).list();
	
	if(listPenjualan.isEmpty())
		return null;
	else 
		return listPenjualan;
	}

	public Penjualan getPenjualanById(int id) {
		// TODO Auto-generated method stub
		//String hql = "from Penjualan p where p.id = :id";
		Session session = sessionFactory.getCurrentSession();
		return session.get(Penjualan.class, id);
		
	}

	public void update(Penjualan penjualan) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(penjualan);
		session.flush();
	}

	public void save(Penjualan penjualan) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(penjualan);
		session.flush();
	}

}
