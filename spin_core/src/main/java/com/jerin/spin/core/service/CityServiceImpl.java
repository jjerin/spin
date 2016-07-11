package com.jerin.spin.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jerin.spin.core.dao.CityDao;
import com.jerin.spin.entity.customer.City;

@Component
public class CityServiceImpl implements CityService {
	@Autowired
	private CityDao cityDao;
	
	public City getCityById(Integer id) {
		return cityDao.getCityById(id);
	}

	public List<City> getAllCities() {
		return cityDao.getAllCities();
	}

}
