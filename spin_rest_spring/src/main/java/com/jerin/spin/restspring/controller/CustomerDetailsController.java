package com.jerin.spin.restspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jerin.spin.core.service.CustomerService;
import com.jerin.spin.entity.customer.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerDetailsController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Customer printHello(){
		return customerService.getCustomerById(1);
	}

}
