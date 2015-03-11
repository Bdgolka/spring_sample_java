package com.bdgolka.service;

import java.util.List;

import com.bdgolka.model.Customer;
import com.bdgolka.repository.CustomerRepository;
import com.bdgolka.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerReposoitory;  
	
	public void setCustomerReposoitory(CustomerRepository customerReposoitory) {
		this.customerReposoitory = customerReposoitory;
	}

	/* (non-Javadoc)
	 * @see com.bdgolka.service.CustomerSetvice#findAll()
	 */
	public List<Customer> findAll()	{
		return customerReposoitory.findAll();
	}
}
