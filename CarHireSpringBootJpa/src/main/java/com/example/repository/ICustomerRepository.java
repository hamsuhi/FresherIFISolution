package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Custromer;

public interface ICustomerRepository extends JpaRepository<Custromer, Integer>{

}
