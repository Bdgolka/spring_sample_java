package com.bdgolka.service;

import java.util.List;

import com.bdgolka.model.Customer;
import com.bdgolka.repository.CustomerRepository;
import com.bdgolka.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerSetvice {

	private CustomerRepository customerReposoitory = new HibernateCustomerRepositoryImpl();  
	
	/* (non-Javadoc)
	 * @see com.bdgolka.service.CustomerSetvice#findAll()
	 */
	public List<Customer> findAll()	{
		return customerReposoitory.findAll();
	}
}
