package com.minato.interfac;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minato.entity.User;

public interface ImpUserRepository extends JpaRepository<User, Long>{

}
