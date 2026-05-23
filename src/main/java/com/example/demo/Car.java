package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand_name")
    private String brand_name;

    @Column(name = "model_name")
    private String model_name;

    @Column(name = "manufacturing_year")
    private int manufacturing_year;

    @Column(name = "legacy_story", columnDefinition = "TEXT")
    private String legacy_story;

    @Column(name = "status")
    private String status;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "price")
    private String price;

    // Constructor
    public Car() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBrand_name() { return brand_name; }
    public void setBrand_name(String brand_name) { this.brand_name = brand_name; }

    public String getModel_name() { return model_name; }
    public void setModel_name(String model_name) { this.model_name = model_name; }

    public int getManufacturing_year() { return manufacturing_year; }
    public void setManufacturing_year(int manufacturing_year) { this.manufacturing_year = manufacturing_year; }

    public String getLegacy_story() { return legacy_story; }
    public void setLegacy_story(String legacy_story) { this.legacy_story = legacy_story; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getImage_url() { return image_url; }
    public void setImage_url(String image_url) { this.image_url = image_url; }

    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }
}