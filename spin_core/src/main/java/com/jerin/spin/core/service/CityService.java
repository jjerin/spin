package com.jerin.spin.core.service;

import java.util.List;

import com.jerin.spin.entity.customer.City;

public interface CityService {
	public City getCityById(Integer id);
	public List<City> getAllCities();
}
