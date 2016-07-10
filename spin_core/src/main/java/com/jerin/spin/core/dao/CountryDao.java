package com.jerin.spin.core.dao;

import java.util.List;

import com.jerin.spin.entity.customer.Country;


public interface CountryDao {
	
	public Country getCountryById(Integer id);
	public List<Country> getAllCountries();

}

