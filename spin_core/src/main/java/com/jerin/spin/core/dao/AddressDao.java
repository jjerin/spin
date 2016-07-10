package com.jerin.spin.core.dao;

import java.util.List;

import com.jerin.spin.entity.customer.Address;


public interface AddressDao {
	
	public Address getAddressById(Integer id);
	public List<Address> getAllAddress();

}
