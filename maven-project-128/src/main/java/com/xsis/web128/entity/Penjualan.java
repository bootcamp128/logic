package com.xsis.web128.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Penjualan {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String no_penjualan;
	private String location;
	@ManyToOne
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNo_penjualan() {
		return no_penjualan;
	}
	public void setNo_penjualan(String no_penjualan) {
		this.no_penjualan = no_penjualan;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
