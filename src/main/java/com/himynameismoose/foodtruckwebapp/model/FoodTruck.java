package com.himynameismoose.foodtruckwebapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

// Lombok annotation
@Getter // Create getters for the instance variables
@Setter // Create setters for the instance variables
@NoArgsConstructor // Create a constructor with no arguments
@AllArgsConstructor // Create a constructor with all instance variables as arguments
// JPA annotation
@Entity // Mapping to MySQL database table
@Table(name = "food_trucks") // The name of the table in database
public class FoodTruck {

    // Instance variables
    @Id // JPA annotation to make ID the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assigns the next primary key
    private int id; // ID of food truck, primary key in table

    // @Column annotation is added to each of the other variables
    // to define column names in the table

    @Column(name = "name")
    private String name; // Name of food truck

    @Column(name = "address")
    private String address; // Address of food truck

    @Column(name = "food_type")
    private String foodType; // Food type of food truck
}
