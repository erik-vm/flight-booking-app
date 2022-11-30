package com.solera.passenger.service;

import com.solera.passenger.model.Passenger;

public interface PassengerService {

    Passenger savePassenger(Passenger passenger);

    Passenger getPassengerById(String id);

    Passenger getPassengerByEmail(String email);
}
