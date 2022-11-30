package com.solera.passenger.model;

import com.solera.location.model.Country;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

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
