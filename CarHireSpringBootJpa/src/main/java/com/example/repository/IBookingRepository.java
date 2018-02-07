package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Booking;

public interface IBookingRepository extends JpaRepository<Booking, Integer>{

}
