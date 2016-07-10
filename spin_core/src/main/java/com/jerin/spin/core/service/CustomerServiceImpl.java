package com.jerin.spin.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jerin.spin.core.dao.CustomerDao;
import com.jerin.spin.entity.customer.Customer;

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	public Customer getCustomerById(Integer id) {
		return customerDao.getCustomerById(id);
	}

	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

}
