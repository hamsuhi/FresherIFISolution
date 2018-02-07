package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.VehicleCategory;

public interface IVehicleCategoryRepository extends JpaRepository<VehicleCategory, Integer>{

}
