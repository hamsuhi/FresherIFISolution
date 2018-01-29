/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 26, 2018, Nguyen Thanh Huong 
 */
package com.dao;

import java.util.List;

import com.entity.Employee;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
public interface IEmployeeDao {

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(int employeeId);

	int addEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(int employeeId);

	boolean employeeExists(int id);

}
