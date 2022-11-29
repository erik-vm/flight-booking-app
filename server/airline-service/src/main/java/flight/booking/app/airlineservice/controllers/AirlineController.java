package flight.booking.app.airlineservice.controllers;

import flight.booking.app.airlineservice.services.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airline")
public class AirlineController {

    @Autowired
    private AirlineService airlineService;
}
