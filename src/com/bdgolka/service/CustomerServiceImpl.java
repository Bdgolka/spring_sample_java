package com.bdgolka.service;

import java.util.List;

import com.bdgolka.model.Customer;
import com.bdgolka.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerReposoitory;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		
		System.out.println("Here is constructor injection");
		this.customerReposoitory = customerRepository;

	}

	public void setCustomerReposoitory(CustomerRepository customerReposoitory) {
		this.customerReposoitory = customerReposoitory;
	}

	public List<Customer> findAll() {
		return customerReposoitory.findAll();
	}
}
