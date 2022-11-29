package flight.booking.app.locationservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class LocationServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocationServicesApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(CityRepository cityRepository, CountryRepository countryRepository){
//        return args -> {
//            String[] countryNames = {"USA", "Japan", "Australia", "Brazil", "Kenya"};
//
//            for (int i = 0; i < countryNames.length; i++){
//                countryRepository.save(new Country(countryNames[i]));
//            }
//
//            String[] estoniaCityName = {"Tallinn", "Taru", "Parnu"};
//            String[] spainCityName = {"Seville", "Madrid", "Barcelona"};
//            String[] australiaCityNames = {"Melbourne", "Sidney", "Brisbane"};
//            for (int i = 0; i < estoniaCityName.length; i++){
//                cityRepository.save(new City(estoniaCityName[i], countryRepository.findByName("Estonia").get()));
//            }
//
//            for (int i = 0; i < spainCityName.length; i++){
//                cityRepository.save(new City(spainCityName[i], countryRepository.findByName("Spain").get()));
//            }
//            for (int i = 0; i < australiaCityNames.length; i++){
//                cityRepository.save(new City(australiaCityNames[i], countryRepository.findByName("Australia").get()));
//            }
//        };
//    }

}
