package com.kpit.sample.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.sample.daos.CustomerDAO;
import com.kpit.sample.pojos.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDAO dao;

	@Override
	public Customer valdiateCustomer(String email, String password) {
		// TODO Auto-generated method stub
		Optional<Customer> op = dao.findById(email);
		
		if(op.isPresent())
		{
			Customer c = op.get();
			
			if(c.getPassword().equals(password))
				{
				return new Customer(email,password);
				}
		}	
		
		return null;
	}

	@Override
	public Customer registerCustomer(Customer customer) {
		dao.save(customer);
		return customer;
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		return (List<Customer>) dao.findAll(); 
	}
	
	
}
