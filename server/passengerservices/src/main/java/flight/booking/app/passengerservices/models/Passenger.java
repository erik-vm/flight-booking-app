package flight.booking.app.passengerservices.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import com.example.locationservices.models.Country;
import java.time.LocalDate;

@Document
public class Passenger {

    @MongoId
    private String id;
    private String firstName;
    private String lastName;
    private Country nationality;
    private String email;
    private String phoneNumber;
    private String idDocNumber;
    private LocalDate dob;
}
