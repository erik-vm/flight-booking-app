package com.example.locationservices.services.implementation;

import com.example.locationservices.models.City;
import com.example.locationservices.repositories.CityRepository;
import com.example.locationservices.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImplementation implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City findCityById(String id) throws Exception {
        Optional<City> cityOptional = cityRepository.findById(id);
        if (cityOptional.isEmpty()){
            throw new Exception("City not found");
        }
        return cityOptional.get();
    }

    @Override
    public City findCityByName(String name) throws Exception {
        Optional<City> cityOptional = cityRepository.findCityByName(name);
        if (cityOptional.isEmpty()){
            throw new Exception("City not found");
        }
        return cityOptional.get();
    }

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
}
