package com.solera.flight.repositroy;

import com.solera.flight.model.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends MongoRepository <Flight, String> {
}
