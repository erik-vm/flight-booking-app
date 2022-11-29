package flight.booking.app.airlineservice.repsitory;

import flight.booking.app.airlineservice.models.Airline;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends MongoRepository <Airline, String> {
}
