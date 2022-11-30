package com.solera.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ServerTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerTemplateApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(CityRepository cityRepository, CountryRepository countryRepository){
//        return args -> {
//
//            Faker faker = new Faker();
//            List<Country> countries = new ArrayList<>();
//
//            for (int i = 0; i < 25; i++){
//                countries.add(countryRepository.save(new Country(faker.country().name())));
//            }
//
//            for (int i = 0; i < 50; i++){
//                cityRepository.save(new City(faker.address().cityName(),
//                        countries.get(new Random().nextInt(0, countries.size()))));
//            }
//        };
   // }



}
