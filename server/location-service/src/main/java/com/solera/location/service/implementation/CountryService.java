package com.solera.location.service.implementation;

import com.solera.location.model.Country;

import java.util.List;

public interface CountryService {

    Country saveCountry(Country country);
    Country findCountryById(String id);
    Country findCountryByName(String name);
    List<Country> getAllCountries();
}
