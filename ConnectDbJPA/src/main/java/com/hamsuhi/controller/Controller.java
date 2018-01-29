/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 29, 2018, Nguyen Thanh Huong 
 */
package com.hamsuhi.controller;

import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hamsuhi.entity.Employee;
import com.hamsuhi.service.EmployeeService;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
@Component
public class Controller implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	@Autowired
	private EmployeeService serviceEmployee;

	@Override
	public void run(String... args) {
		int id;
		String name;
		double salary;
		try {
			Scanner sc = new Scanner(System.in);

			System.out.print("1. Please Enter Your ID, Name, Salary: " + "\nID is: ");
			id = sc.nextInt();

			System.out.println("Salary is ");
			salary = sc.nextDouble();

			System.out.println("Name is: ");
			name = sc.next();

		} catch (Exception e) {
			System.err.println("ERROR enter your information! ");
		}

		log.info("--------------------------------------");
		log.info("Enter information all employee: ");
		showAllEmployee();

		log.info("--------------------------------------");
		Employee a = new Employee(001, "Lisa", 255.6);
		Employee b = new Employee(004, "Scotte", 249.4);
		Employee c = new Employee(002, "Mia", 300.0);
		serviceEmployee.insert(a);
		serviceEmployee.insert(b);
		serviceEmployee.insert(c);

		log.info("---------------------------------------");
		log.info("Delete with MyService: ");
		serviceEmployee.delete(2);
		log.info("Deleted id 2....");
		for (Employee employee : serviceEmployee.getAllEmployee()) {
			log.info(employee.toString());
		}
		log.info("---------------------------------------");

		log.info("Update user Naruto to Sasuke by MyService: ");
		Employee d = new Employee(12, "SasukeService", 239.5);
		serviceEmployee.update(a, d);

		for (Employee user : serviceEmployee.getAllEmployee()) {
			log.info(user.toString());
		}
		log.info("---------------------------------------");

	}

	public void showByID(int id) {
		Employee e = serviceEmployee.getEmployeeById(id);
	}

	public void showAllEmployee() {
		// List<Employee> emp = serviceEmployee.getAllEmployee();
		for (Employee e : serviceEmployee.getAllEmployee()) {
			log.info("Information employee " + e + "is: " + e.getId() + " , " + e.getName() + " , " + e.getSalary());
		}
	}
}
