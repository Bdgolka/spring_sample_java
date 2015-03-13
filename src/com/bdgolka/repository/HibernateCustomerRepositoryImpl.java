package com.bdgolka.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bdgolka.model.Customer;

@Repository("customerRepository")
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
