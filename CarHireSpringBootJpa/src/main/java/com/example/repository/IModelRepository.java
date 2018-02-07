package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Model;

public interface IModelRepository extends JpaRepository<Model, Integer>{

}
