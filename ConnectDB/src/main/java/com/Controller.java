/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 26, 2018, Nguyen Thanh Huong 
 */
package com;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.entity.Employee;
import com.service.IServiceEmployee;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
@Component
@ComponentScan({ "com.service", "com.dao" })
public class Controller implements CommandLineRunner {
	private final static Logger log = LogManager.getLogger(Controller.class);
	@Autowired
	private IServiceEmployee serviceEmp;

	@Override
	public void run(String... args) throws Exception {
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

			log.info("Entered from keyboard: ");
			serviceEmp.addEmployee(new Employee(id, name, salary));
			log.info("Begin print all employee: ");
			printAllEmployee();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("ERROR enter your information! ");
		}

		// find employee
		printAllEmployee();
		printUserById(10);
		// Add employee
		log.info("________Please to add a employee! :3__________");
		serviceEmp.addEmployee(new Employee(12, "Monalisa", 311.2));

		// Update employee
		log.info("________Please to UPDATE a employee! :>________");
		serviceEmp.updateEmployee(new Employee(001, "Tu tai la toi", 300));

		// Delete employee
		log.info("________Please to DELETE a employee! ^.^_______");
		serviceEmp.deleteEmployee(002);
	}

	public void printAllEmployee() {
		log.info("____________Show all employee information____________");
		List<Employee> employee = serviceEmp.getAllEmployee();
		for (Employee emp : employee) {
			log.info("Thong tin employee: " + emp.getId() + " , " + emp.getFullName() + " , " + emp.getSalary());
		}
	}

	public void printUserById(int id) {
		log.info("_____________Show user by ID information_____________");
		Employee emp = serviceEmp.getEmployeeById(id);
		if (!serviceEmp.checkEmployee(id)) {
			log.info(
					"Thong tin employee theo ID: " + emp.getId() + " , " + emp.getFullName() + " , " + emp.getSalary());
		} else {
			log.info("Ten Employee trung ID roi. Hehe @.@");
		}
	}
}
