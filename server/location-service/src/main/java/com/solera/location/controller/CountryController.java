package com.solera.location.controller;

import com.solera.location.model.Country;
import com.solera.location.service.implementation.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    
    @Autowired
    private CountryService countryService;
    
    @PostMapping ("/save")
    Country saveCountry(@RequestBody Country country){
        return countryService.saveCountry(country);
    }

    @PutMapping("/id:{id}")
    Country findCountryById(@PathVariable String id){
        return countryService.findCountryById(id);
    }

    @PutMapping("/name:{name}")
    Country findCountryByName(@PathVariable String name){
        return countryService.findCountryByName(name);
    }

    @PutMapping("/all")
    List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }
}
