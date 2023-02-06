package com.jerin.spin.spinservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jerin.spin.spinservice.model.Customer;

@Mapper
public interface CustomerMapper {
	
	List<Customer> getAllCustomer();
	
	void addCustomer(Customer customer);

}
