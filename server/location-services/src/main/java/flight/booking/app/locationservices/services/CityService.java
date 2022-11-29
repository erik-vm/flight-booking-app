package flight.booking.app.locationservices.services;

import flight.booking.app.locationservices.models.City;

import java.util.List;

public interface CityService {

    City saveCity(City city);
    City findCityById(String id) throws Exception;
    City findCityByName(String name) throws Exception;
    List<City> getAllCities();
}
