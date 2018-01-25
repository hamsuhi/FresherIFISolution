/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 25, 2018, Nguyen Thanh Huong 
 */
package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
//This will be AUTO IMPLEMENTED by Spring into a Bean called employmentRepository
//CRUD refers Create, Read, Update, Delete.
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	List<Employee> findByFullName(String fullname);
}
