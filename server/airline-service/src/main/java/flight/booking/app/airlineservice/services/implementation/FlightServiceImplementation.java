package flight.booking.app.airlineservice.services.implementation;

import flight.booking.app.airlineservice.repsitory.FlightRepository;
import flight.booking.app.airlineservice.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImplementation implements FlightService {

    @Autowired
    private FlightRepository flightRepository;
}
