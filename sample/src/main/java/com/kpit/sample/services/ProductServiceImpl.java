package com.kpit.sample.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.sample.daos.ProductDAO;
import com.kpit.sample.pojos.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO dao;

	@Override
	public void addProduct(Product product) {
		dao.save(product);
	}

	@Override
	public void removeProduct(int id) {
		dao.deleteById(id);
	}

	@Override
	public Product getProduct(int id) {
		Optional<Product> op = dao.findById(id);
		if(op.isPresent())
		{
			return op.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) dao.findAll();
	}
	
	

}
