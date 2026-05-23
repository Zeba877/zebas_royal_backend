package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*") // 👈 This allows your React frontend to connect securely!
@RestController
@RequestMapping("/api/cars")
public class CarController {

    // Helper class representing a Car structure
    public static class Car {
        private Long id;
        private String name;
        private String model;
        private double price;

        public Car(Long id, String name, String model, double price) {
            this.id = id;
            this.name = name;
            this.model = model;
            this.price = price;
        }

        // Getters and Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getModel() { return model; }
        public void setModel(String model) { this.model = model; }
        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }
    }

    // GET Endpoint to fetch all cars data
    @GetMapping
    public List<Car> getAllCars() {
        return Arrays.asList(
            new Car(1L, "Maruti Swift", "VXI", 700000),
            new Car(2L, "Hyundai i20", "Asta", 900000),
            new Car(3L, "Tata Nexon", "Creative", 1100000)
        );
    }
}