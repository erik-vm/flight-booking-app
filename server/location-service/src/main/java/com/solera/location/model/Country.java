package com.solera.location.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document
@NoArgsConstructor
public class Country {


    @MongoId
    private String id;
    private String name;


}
