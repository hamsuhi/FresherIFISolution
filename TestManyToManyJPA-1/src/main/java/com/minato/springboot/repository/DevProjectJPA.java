/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Feb 1, 2018, Nguyen Thanh Huong 
 */
package com.minato.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minato.springboot.entity.Project;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
public interface DevProjectJPA extends JpaRepository<Project, Integer> {

}
