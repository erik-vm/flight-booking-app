package com.solera.passenger.controller;

import com.solera.passenger.model.Passenger;
import com.solera.passenger.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping
    Passenger savePassenger(Passenger passenger){
        return passengerService.savePassenger(passenger);
    }

}
