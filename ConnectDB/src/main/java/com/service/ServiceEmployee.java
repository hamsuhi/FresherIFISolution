/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 26, 2018, Nguyen Thanh Huong 
 */
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IEmployeeDao;
import com.entity.Employee;

/**
 * @author Nguyễn Thanh Hương
 */
@Service
// @ComponentScan({"com.dao"})
public class ServiceEmployee implements IServiceEmployee {
	@Autowired
	private IEmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return employeeDao.getEmployeeById(employeeId);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);		
	}

	@Override
	public boolean checkEmployee(int id) {
		if (employeeDao.employeeExists(id)) {
			return false;
		} else {
			return true;
		}
	}
}
