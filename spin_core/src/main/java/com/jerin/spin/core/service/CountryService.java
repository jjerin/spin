package com.jerin.spin.core.service;

import java.util.List;

import com.jerin.spin.entity.customer.Country;

public interface CountryService {
	public Country getCountryById(Integer id);
	public List<Country> getAllCountries();
}
