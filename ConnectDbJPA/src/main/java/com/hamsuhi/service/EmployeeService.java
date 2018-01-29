/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 29, 2018, Nguyen Thanh Huong 
 */
package com.hamsuhi.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamsuhi.entity.Employee;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
@Transactional
@Repository
public class EmployeeService {

	// An EntityManager will be automatically injected from entityManagerFactory
	// setup on DatabaseConfig class.
	@PersistenceContext
	private EntityManager entiyManager;

	/**
	 * Return all the users stored in the database.
	 */
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {
		Query query = entiyManager.createNamedQuery("employee", Employee.class);
		return query.getResultList();
	}

	public Employee getEmployeeById(int id) {
		return entiyManager.find(Employee.class, id);
	}

	public void insert(Employee emp) {
		entiyManager.persist(emp);
	}

	public void update(Employee oldEmp, Employee newEmp) {
		Employee e = getEmployeeById(oldEmp.getId());
		if (e != null) {
			e.setName(newEmp.getName());
			e.setSalary(newEmp.getSalary());
			insert(e);
		} else {
			entiyManager.merge(e);
		}
	}

	public void delete(int id) {
		if (entiyManager.contains(getEmployeeById(id))) {
			entiyManager.remove(getEmployeeById(id));
		} else {
			entiyManager.merge(getEmployeeById(id));
		}

	}
}
