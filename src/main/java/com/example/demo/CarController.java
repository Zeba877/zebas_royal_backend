package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/cars")

public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public java.util.List<Car> getAllCars() {
        // Pagination ka jhanjhat khatam! Ab poori 30 cars ek saath daudengi screen par.
        return carRepository.findAll();
    
    }
}