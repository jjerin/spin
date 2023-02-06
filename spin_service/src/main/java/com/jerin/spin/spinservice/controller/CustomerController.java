package com.jerin.spin.spinservice.controller;

import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jerin.spin.spinservice.model.Customer;
import com.jerin.spin.spinservice.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	public static final Logger log = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping(path="")
	public List<Customer> getAllCustomer() {
		
		log.info("getAllCustomer called");
		//List<Customer> customerList = customerService.getAllCustomer();
		/*
		 Customer c =
		 customerList.stream().max(Comparator.comparing(Customer::getCustomerId)).orElse(null); c.setCustomerId(c.getCustomerId()+1);
		 customerService.addCustomer(c);
		 */
		return customerService.getAllCustomer();
	}
	
	@GetMapping(path="/by-id")
	public Customer getCustomer(@RequestParam(value = "id", required = true)Integer id) {
		log.info("getCustomer called with id: "+id);
		
		
		return customerService.getCustomerById(id);
	}
	
	@PostMapping(path="addCustomer")
	public void addCustomer(@RequestBody Customer customer) {
		List<Customer> customerList = customerService.getAllCustomer();
		 Customer c = customerList.stream().max(Comparator.comparing(Customer::getCustomerId)).orElse(null); 
		 customer.setCustomerId(c.getCustomerId()+1);
		 customerService.addCustomer(customer);

		//customerService.addCustomer(customer);
	}
	
	@PostMapping(path="updateCustomer")
	public void updateCustomer(@RequestBody Customer customer) {
		log.info("updateCustomer called with customer: "+customer);
		customerService.updateCustomer(customer);
	}
	
	@DeleteMapping(path="deleteCustomer/by-id")
	public void deleteCustomer(@RequestParam(value = "id", required = true)Integer id) {
		log.info("deleteCustomer called with id: "+id);
		customerService.deleteCustomer(id);
	}

}
