package com.himynameismoose.foodtruckwebapp.controller;

import com.himynameismoose.foodtruckwebapp.model.FoodTruck;
import com.himynameismoose.foodtruckwebapp.repository.FoodTruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class will handle all HTTP Requests
 *
 * @author mershellerivera
 * @version 1.0
 */
@RestController // REST API Controller by HTTP Requests
@RequestMapping("/api/v1/foodtrucks") // This is the default mapping of the URL
public class FoodTruckController {

    @Autowired
    private FoodTruckRepository foodTruckRepository;

    @GetMapping
    public List<FoodTruck> getAllFoodTrucks() {
        return foodTruckRepository.findAll();
    }

}
