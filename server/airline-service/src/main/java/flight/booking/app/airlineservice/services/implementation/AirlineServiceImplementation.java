package flight.booking.app.airlineservice.services.implementation;

import flight.booking.app.airlineservice.repsitory.AirlineRepository;
import flight.booking.app.airlineservice.services.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineServiceImplementation implements AirlineService {

    @Autowired
    private AirlineRepository airlineRepository;
}
