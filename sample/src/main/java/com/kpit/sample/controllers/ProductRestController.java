package com.kpit.sample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.sample.pojos.Product;
import com.kpit.sample.services.ProductService;

@RestController
@CrossOrigin
public class ProductRestController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("products/api/kpit/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		service.addProduct(product);
		return product;
	}
	
	@GetMapping("products/api/kpit/getProduct/{id}")
	public Product getProduct(@PathVariable int id)
	{
		return service.getProduct(id);
	}
	
	@GetMapping("products/api/kpit/getAllProducts")
	public List<Product> getAllProducts()
	{
		return service.getAllProducts();
	}
	
	@GetMapping("products/api/kpit/removeProduct/{id}")
	public String removeProduct(@PathVariable int id){
		service.removeProduct(id);
		return "{status:ok}";
	}
	
}
