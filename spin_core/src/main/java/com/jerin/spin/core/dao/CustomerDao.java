package com.jerin.spin.core.dao;

import java.util.List;

import com.jerin.spin.entity.customer.Customer;

public interface CustomerDao {
	
	public Customer getCustomerById(Integer id);
	public List<Customer> getAllCustomers();

}
