package com.kpit.sample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.sample.pojos.Customer;
import com.kpit.sample.services.CustomerService;

@RestController
@CrossOrigin
public class CustomerRestController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/customers/api/kpit/validateCustomer/{email}/{password}")
	public Customer m1(@PathVariable("email") String email,@PathVariable("password") String password)
	{
		return service.valdiateCustomer(email,password);
	}
	
	@PostMapping("/customers/api/kpit/addCustomer")
	public Customer m2(@RequestBody Customer customer)
	{
		System.out.println(customer);
		return service.registerCustomer(customer);
	}
	
	@GetMapping("/customers/api/kpit/getAllCustomers")
	public List<Customer> m3()
	{
		return service.getAllCustomers();
	}

}
