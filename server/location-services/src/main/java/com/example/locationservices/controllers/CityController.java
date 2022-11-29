package com.example.locationservices.controllers;

import com.example.locationservices.models.City;
import com.example.locationservices.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("/save")
    City saveCity(@RequestBody City city){
        return cityService.saveCity(city);
    }

    @PutMapping("/id:{id}")
    City findCityById(@PathVariable String id) throws Exception {
        return cityService.findCityById(id);
    }

    @PutMapping("/name:{name}")
    City findCityByName(@PathVariable String name) throws Exception {
        return cityService.findCityByName(name);
    }

    @PutMapping("/all")
    List<City> getAllCities(){
       return cityService.getAllCities();
    }
}
