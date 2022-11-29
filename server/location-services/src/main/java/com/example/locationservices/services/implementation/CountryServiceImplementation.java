package com.example.locationservices.services.implementation;

import com.example.locationservices.models.Country;
import com.example.locationservices.repositories.CountryRepository;
import com.example.locationservices.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImplementation implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country findCountryById(String id) {
        return countryRepository.findById(id).get();
    }

    @Override
    public Country findCountryByName(String name) {
        return countryRepository.findByName(name).get();
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
