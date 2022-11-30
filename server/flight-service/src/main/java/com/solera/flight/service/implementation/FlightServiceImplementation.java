package com.solera.flight.service.implementation;

import com.solera.flight.repositroy.FlightRepository;
import com.solera.flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImplementation implements FlightService {

    @Autowired
    private FlightRepository flightRepository;
}
