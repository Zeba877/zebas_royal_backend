package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository; // 👈 Putting this back fixes the crash!

    // Static Car structure class
    public static class CarStructure {
        private Long id;
        private String name;
        private String model;
        private double price;

        public CarStructure(Long id, String name, String model, double price) {
            this.id = id;
            this.name = name;
            this.model = model;
            this.price = price;
        }

        public Long getId() { return id; }
        public String getName() { return name; }
        public String getModel() { return model; }
        public double getPrice() { return price; }
    }

    // Endpoint that returns your list cleanly
    @GetMapping
    public List<CarStructure> getAllCars() {
        return Arrays.asList(
            new CarStructure(1L, "Maruti Swift", "VXI", 700000),
            new CarStructure(2L, "Hyundai i20", "Asta", 900000),
            new CarStructure(3L, "Tata Nexon", "Creative", 1100000)
        );
    }
}