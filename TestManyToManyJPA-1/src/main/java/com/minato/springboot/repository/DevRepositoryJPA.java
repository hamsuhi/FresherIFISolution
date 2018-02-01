package com.minato.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minato.springboot.entity.Developer;

public interface DevRepositoryJPA extends JpaRepository<Developer, Integer>{

}
