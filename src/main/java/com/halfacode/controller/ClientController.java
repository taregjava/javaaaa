package com.halfacode.controller;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.halfacode.model.Customer;
import com.halfacode.repo.CustomerRepo;

@Named
@ViewScoped
public class ClientController {

	@Autowired
	private CustomerRepo clientRepo;
	
	private Customer client = new Customer();
	
	
	public void save() {
		clientRepo.save(getClient());
	}
	

	public Customer getClient() {
		return client;
	}

	public void setClient(Customer client) {
		this.client = client;
	}
	
	
}
