package com.solera.airline.model;

import com.solera.location.model.City;
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
