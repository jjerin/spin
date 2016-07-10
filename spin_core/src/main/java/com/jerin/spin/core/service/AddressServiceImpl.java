package com.jerin.spin.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jerin.spin.core.dao.AddressDao;
import com.jerin.spin.entity.customer.Address;

public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDao addressDao;

	public Address getAddressById(Integer id) {
		return addressDao.getAddressById(id);
	}

	public List<Address> getAllAddresses() {
		return addressDao.getAllAddress();
	}

}
