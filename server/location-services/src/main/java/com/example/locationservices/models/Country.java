package com.example.locationservices.models;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class Country {


    @Id
    private UUID id;
    private String name;


}
