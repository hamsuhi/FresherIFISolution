package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.BookingStatus;

public interface IBookingStatusRepository extends JpaRepository<BookingStatus, Integer>{

}
