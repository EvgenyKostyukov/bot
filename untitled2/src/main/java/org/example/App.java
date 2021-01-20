package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.City;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",
                Communication.class);

//        List<City> allCities = communication.getAllCities();
//        System.out.println(allCities);

//        City empByID = communication.getCity(1);
//        System.out.println(empByID);

//        City city = new City("edqwd", "Не пожалеете");
//        city.setId(1);
//        communication.saveCity(city);

        communication.deleteCity(1);
    }
}
