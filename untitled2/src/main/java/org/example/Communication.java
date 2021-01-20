package org.example;

import org.example.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8050/untitled1/api/cities";

    public List<City> getAllCities() {
        ResponseEntity<List<City>> responseEntity =
                restTemplate.exchange(URL, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<City>>() {
                        });
        List<City> allCities = responseEntity.getBody();
        return allCities;
    }

    public City getCity(int id) {
        City city = restTemplate.getForObject(URL+"/" + id
        , City.class);
        return city;
    }

    public void saveCity(City city) {
        int id = city.getId();
        if(id == 0) {
            ResponseEntity<String> responseEntity =
                    restTemplate.postForEntity(URL, city, String.class);
            System.out.println("New city  was added to DB");
            System.out.println(responseEntity.getBody());
        }
        else{
            restTemplate.put(URL,city);
            System.out.println("City with ID " + id + " was updated");
        }

    }

    public void deleteCity(int id) {

        restTemplate.delete(URL + "/" + id);
        System.out.println();
        System.out.println("City with ID " + id + " was deleted from DB");

    }
}
