package flight.booking.app.airlineservice.models;

import com.example.locationservices.models.City;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import flight.booking.app.passengerservices.models.Passenger;

import java.time.LocalDateTime;

@Document
@Data
public class Flight {

    @MongoId
    private String id;
    private Airline airline;
    private City departureCity;
    private City destinationCity;
    private Passenger passenger;
    private boolean luggageAllowed;
    private boolean hasLuggage;
    private double pricePerPerson;
    private LocalDateTime departureDate;
    private int numberOfLayovers;
}
