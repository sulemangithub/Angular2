package com.kpit.sample.services;

import java.util.List;

import com.kpit.sample.pojos.Product;

public interface ProductService {

	public void addProduct(Product product);
	public void removeProduct(int id);
	public Product getProduct(int id);
	public List<Product> getAllProducts();	
	
}
