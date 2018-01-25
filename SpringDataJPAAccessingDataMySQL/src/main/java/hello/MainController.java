/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 25, 2018, Nguyen Thanh Huong 
 */
package hello;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
@Controller
@RequestMapping(path = "/demo")
@SpringBootApplication
public class MainController {
	public  final static Logger logger = LogManager.getLogger(MainController.class);
	@Autowired
	private EmployeeRepository impEmployee;

	@Bean
	public CommandLineRunner demo(EmployeeRepository repository) {
		return (args) -> {
			repository.save(new Employee("004", "Hana", 239));
			repository.save(new Employee("005", "Scotte", 420));
			repository.save(new Employee("005", "Lisa", 710));
			repository.save(new Employee("006", "Hương", 710));
			// lấy all employee
			logger.info("Empoyee found with findAll(): ");
			logger.info("______________________________");
			for (Employee employee : repository.findAll()) {
				logger.info(employee.toString());
			}
			logger.info("");

			// lấy nhân viên theo tên
			logger.info("Employee found with finfByFullName(): ");
			logger.info("***************************************");
			for (Employee emp : repository.findByFullName("Hương")) {
				logger.info(emp.toString());
			}
			logger.info("");
		};
	}

	@GetMapping(path = "/add") // Map only get Requests
	public @ResponseBody String addNewUser(@RequestParam String iD, @RequestParam String name,
			@RequestParam double salary) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Employee n = new Employee();
		n.setId(iD);
		n.setName(name);
		n.setSalary(salary);
		impEmployee.save(n);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Employee> getAllUsers() {
		// This returns a JSON or XML with the users
		return impEmployee.findAll();
	}

}
