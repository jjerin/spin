package com.jerin.spin.core.service;

import java.util.List;

import com.jerin.spin.entity.customer.Address;

public interface AddressService {
	public Address getAddressById(Integer id);
	public List<Address> getAllAddresses();
}
