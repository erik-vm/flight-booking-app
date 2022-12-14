package com.solera.passenger.repositroy;

import com.solera.passenger.model.Passenger;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends MongoRepository<Passenger, String> {

    Passenger findByEmail(String email);
}
