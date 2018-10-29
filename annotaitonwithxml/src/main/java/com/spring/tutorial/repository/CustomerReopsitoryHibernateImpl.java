package com.spring.tutorial.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import com.spring.tutorial.model.Customer;

public class CustomerReopsitoryHibernateImpl implements CustomerRepository {
	
	@Value("${dbName}")
	private String dbName;
	
	@Override
	public List<Customer> findAll() {
		System.out.println(dbName);
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setFirstName("Pradeep");
		customer.setLastName("Kukkala");
		
		customers.add(customer);
		
		return customers;
	}
}
