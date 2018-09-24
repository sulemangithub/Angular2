package com.kpit.sample.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kpit.sample.pojos.Customer;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, String>{

}
