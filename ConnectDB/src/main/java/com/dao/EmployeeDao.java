/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 26, 2018, Nguyen Thanh Huong 
 */
package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Employee;

/**
 * @author Nguyễn Thanh Hương
 */
@Transactional
@Repository
// @ComponentScan({"com.entity"})
public class EmployeeDao implements IEmployeeDao {
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		String sql = "from Employee";
		return (List<Employee>) entityManager.createQuery(sql).getResultList();
	}

	@Override
	public Employee getEmployeeById(String employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}

	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		Employee emp = getEmployeeById(employee.getId());
		emp.setFullName(employee.getFullName());
		emp.setSalary(employee.getSalary());
		entityManager.flush();
	}

	@Override
	public void deleteEmployee(String employeeId) {
		entityManager.remove(getEmployeeById(employeeId));
	}

	@Override
	public boolean employeeExists(String id) {
		String sql = "from Employee as e where e.id= :id";
		int count = entityManager.createQuery(sql).setParameter("id", id).getResultList().size();
		return count > 0 ? true : false;
	}

}
