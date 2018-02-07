package com.example.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Manufacturer;

public interface IManufacturerRepository extends JpaRepository<Manufacturer, Integer>{

//public Set<Manufacturer> getManufacturerByName(String name);

}
