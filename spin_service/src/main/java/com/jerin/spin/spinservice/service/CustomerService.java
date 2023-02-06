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
	
	public Customer getCustomerById(Integer id) {
		return customerMapper.getCustomerById(id);
	}
	
	public void addCustomer(Customer customer) {
		customerMapper.addCustomer(customer);
	}

	public void updateCustomer(Customer customer) {
		customerMapper.updateCustomer(customer);
		
	}

	public void deleteCustomer(Integer id) {
		customerMapper.deleteCustomer(id);
	}
}
