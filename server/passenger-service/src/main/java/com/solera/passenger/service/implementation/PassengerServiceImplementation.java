package com.solera.passenger.service.implementation;

import com.solera.passenger.model.Passenger;
import com.solera.passenger.repositroy.PassengerRepository;
import com.solera.passenger.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImplementation implements PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;


    @Override
    public Passenger savePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public Passenger getPassengerById(String id) {
        return passengerRepository.findById(id).get();
    }

    @Override
    public Passenger getPassengerByEmail(String email) {
        return passengerRepository.findByEmail(email);
    }
}
