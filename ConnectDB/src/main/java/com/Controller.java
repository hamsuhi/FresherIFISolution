/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 26, 2018, Nguyen Thanh Huong 
 */
package com;

import java.util.List;

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
		// Add employee
		log.info("________Please to add a employee! :3__________");
		Employee e = new Employee(001 , "Hương", 450);
		serviceEmp.addEmployee(e);
		log.info(e.toString());
		
//		Employee e1 = new Employee(023, "lISA", 500);
//		serviceEmp.addEmployee(e1);
//		log.info(e1.toString());
//		
//		Employee e2 = new Employee(024, "Scotte", 300);
//		serviceEmp.addEmployee(e2);
//		log.info(e2.toString());
		// serviceEmp.addEmployee(new Employee("010", "Hương xinh", 450));

		// Update employee
//		if (serviceEmp.checkEmployee(001)) {
//			log.info("________Please to UPDATE a employee! :>________");
//
//			serviceEmp.updateEmployee(new Employee(001, "Tu tai la toi", 300));
//		}else {
//			log.error("Error update!");
//		}
		
		// // Delete employee
//		if(!serviceEmp.checkEmployee(342)) {
//		log.info("________Please to DELETE a employee! ^.^_______");
//		serviceEmp.deleteEmployee(342);
//		} else {
//			log.error("Error delete");
//		}
		
	
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
			log.info("Thong tin employee theo ID: " + emp.getId() + " , " + emp.getFullName() + " , " + emp.getSalary());
		} else {
			log.info("Ten Employee trung ID roi. Hehe @.@");
		}
	}

}
