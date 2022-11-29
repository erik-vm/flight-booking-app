package com.example.locationservices.models;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;


@Data
public class City {


    @Id
    private UUID uuid;
    private String name;
    private Country country;
}
