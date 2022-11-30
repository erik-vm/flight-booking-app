package com.solera.location.service.implementation;

import com.solera.location.model.City;

import java.util.List;

public interface CityService {

    City saveCity(City city);
    City findCityById(String id) throws Exception;
    City findCityByName(String name) throws Exception;
    List<City> getAllCities();
}
