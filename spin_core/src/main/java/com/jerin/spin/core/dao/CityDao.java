package com.jerin.spin.core.dao;

import java.util.List;

import com.jerin.spin.entity.customer.City;


public interface CityDao {
	
	public City getCityById(Integer id);
	public List<City> getAllCities();

}

