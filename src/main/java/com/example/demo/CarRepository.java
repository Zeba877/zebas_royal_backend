package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    // Pure Native MySQL query - isme variable name ka koi jhanjhat nahi hota, direct database columns use hote hain
    @Query(value = "SELECT * FROM cars WHERE LOWER(brand_name) LIKE LOWER(CONCAT('%', :search, '%')) OR LOWER(model_name) LIKE LOWER(CONCAT('%', :search, '%'))", 
           countQuery = "SELECT count(*) FROM cars WHERE LOWER(brand_name) LIKE LOWER(CONCAT('%', :search, '%')) OR LOWER(model_name) LIKE LOWER(CONCAT('%', :search, '%'))", 
           nativeQuery = true)
    Page<Car> searchCars(@Param("search") String search, Pageable pageable);
}