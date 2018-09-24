package com.kpit.sample.services;

import java.util.List;

import com.kpit.sample.pojos.Customer;

public interface CustomerService {

	public Customer valdiateCustomer(String email,String password);
	public Customer registerCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	
}
