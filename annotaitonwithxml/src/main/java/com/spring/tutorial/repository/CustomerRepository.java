package com.spring.tutorial.repository;

import java.util.List;

import com.spring.tutorial.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}