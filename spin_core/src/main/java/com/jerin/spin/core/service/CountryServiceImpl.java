package com.jerin.spin.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jerin.spin.core.dao.CountryDao;
import com.jerin.spin.entity.customer.Country;

@Component
public class CountryServiceImpl implements CountryService {
	@Autowired
	private CountryDao countryDao;

	public Country getCountryById(Integer id) {
		return countryDao.getCountryById(id);
	}

	public List<Country> getAllCountries() {
		return countryDao.getAllCountries();
	}

}
