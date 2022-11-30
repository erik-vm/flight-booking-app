package com.solera.location.repositroy;

import com.solera.location.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends MongoRepository<Country, String> {
    Optional<Country> findByName(String name);
}
