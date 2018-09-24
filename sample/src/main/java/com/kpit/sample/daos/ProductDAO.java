package com.kpit.sample.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kpit.sample.pojos.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product,Integer>{

}
