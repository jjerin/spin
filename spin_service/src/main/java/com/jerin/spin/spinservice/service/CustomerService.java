package com.jerin.spin.spinservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jerin.spin.spinservice.mapper.CustomerMapper;
import com.jerin.spin.spinservice.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerMapper customerMapper;
	
	public List<Customer> getAllCustomer() {
		return customerMapper.getAllCustomer();
	}
	
	public void addCustomer(Customer customer) {
		customerMapper.addCustomer(customer);
	}
}
