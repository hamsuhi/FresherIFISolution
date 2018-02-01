/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 31, 2018, Nguyen Thanh Huong 
 */
package com.hamsuhi.repositoryC1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamsuhi.entity.Course;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
public interface ICourseRepository extends JpaRepository<Course, Integer>{

}
