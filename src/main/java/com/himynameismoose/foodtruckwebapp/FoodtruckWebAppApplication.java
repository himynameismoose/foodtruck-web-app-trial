package com.himynameismoose.foodtruckwebapp;

import com.himynameismoose.foodtruckwebapp.model.FoodTruck;
import com.himynameismoose.foodtruckwebapp.repository.FoodTruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodtruckWebAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FoodtruckWebAppApplication.class, args);
	}

	@Autowired
	private FoodTruckRepository foodTruckRepository;

	@Override
	public void run(String... args) throws Exception {
		FoodTruck foodtruck = new FoodTruck();
		foodtruck.setName("Red Robin");
		foodtruck.setAddress("420 ST");
		foodtruck.setFoodType("Burgers");

		foodTruckRepository.save(foodtruck);
	}
}
