package com.solera.airline.service.implementation;

import com.solera.airline.repositroy.AirlineRepository;
import com.solera.airline.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineServiceImplementation implements AirlineService {

    @Autowired
    private AirlineRepository airlineRepository;
}
