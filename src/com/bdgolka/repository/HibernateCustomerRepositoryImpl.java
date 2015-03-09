package com.bdgolka.repository;

import java.util.ArrayList;
import java.util.List;

import com.bdgolka.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	
	/* (non-Javadoc)
	 * @see com.bdgolka.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll(){
		
		List <Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstmname("Julia");
		customer.setLastname("Pulova");
		
		customers.add(customer);
		
		return customers;
	}

}
