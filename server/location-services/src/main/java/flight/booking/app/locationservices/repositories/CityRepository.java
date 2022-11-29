package flight.booking.app.locationservices.repositories;

import flight.booking.app.locationservices.models.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends MongoRepository<City, String> {
    Optional<City> findCityByName(String name);
}
