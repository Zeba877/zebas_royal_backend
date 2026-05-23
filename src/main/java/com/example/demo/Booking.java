package com.example.demo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String phoneNumber;
    private LocalDate bookingDate;
    private String carDetails;

    // Default Constructor (JPA requirement)
    public Booking() {}

    // Parameterized Constructor
    public Booking(String customerName, String phoneNumber, LocalDate bookingDate, String carDetails) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.bookingDate = bookingDate;
        this.carDetails = carDetails;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public LocalDate getBookingDate() { return bookingDate; }
    public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }

    public String getCarDetails() { return carDetails; }
    public void setCarDetails(String carDetails) { this.carDetails = carDetails; }
}