package com.solera.airline.repositroy;

import com.solera.airline.model.Airline;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends MongoRepository <Airline, String> {
}
