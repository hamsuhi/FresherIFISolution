/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 29, 2018, Nguyen Thanh Huong 
 */
package com.hamsuhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamsuhi.entity.Employee;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
public interface ImpEmployeeJPA extends JpaRepository<Employee, Long>{

}
