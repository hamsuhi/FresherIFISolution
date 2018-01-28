/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 26, 2018, Nguyen Thanh Huong 
 */
package com.service;

import java.util.List;

import com.entity.Employee;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
public interface IServiceEmployee {
	List<Employee> getAllEmployee();

	Employee getEmployeeById(String employeeId);

	boolean checkEmployee(String id);
	
	void addEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(String employeeId);

}
