package com.jerin.spin.core.service;

import java.util.List;

import com.jerin.spin.entity.customer.Customer;

public interface CustomerService {
	public Customer getCustomerById(Integer id);
	public List<Customer> getAllCustomers();
}
