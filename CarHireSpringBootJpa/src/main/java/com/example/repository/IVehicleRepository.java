package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Vehicle;

public interface IVehicleRepository extends JpaRepository<Vehicle, Integer> {

}
