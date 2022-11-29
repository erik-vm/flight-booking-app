package flight.booking.app.locationservices.services;

import flight.booking.app.locationservices.models.Country;

import java.util.List;

public interface CountryService {

    Country saveCountry(Country country);
    Country findCountryById(String id);
    Country findCountryByName(String name);
    List<Country> getAllCountries();
}
