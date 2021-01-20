package com.evgeny.spring.rest.service;

import com.evgeny.spring.rest.entity.City;

import java.util.List;

public interface CityService {
    public List<City> getAllCities();

    public void saveCities(City city);

    public City getCity(int id);

    public  void deleteCity(int id);

}
