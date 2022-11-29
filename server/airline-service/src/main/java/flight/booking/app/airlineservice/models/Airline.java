package flight.booking.app.airlineservice.models;

import com.example.locationservices.models.City;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@Data
public class Airline {

    @MongoId
    private String id;
    private String name;
    private City city;
}
