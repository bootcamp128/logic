package com.xsis.web128.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	@Column(name="no_contact")
	private String noContact;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="customer")
	@JsonIgnoreProperties(allowSetters = true, value = { "customer" })
	private List<Penjualan> listPenjualan;
	
	public List<Penjualan> getListPenjualan() {
		return listPenjualan;
	}
	public void setListPenjualan(List<Penjualan> listPenjualan) {
		this.listPenjualan = listPenjualan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNoContact() {
		return noContact;
	}
	public void setNoContact(String noContact) {
		this.noContact = noContact;
	}
	
	
}
