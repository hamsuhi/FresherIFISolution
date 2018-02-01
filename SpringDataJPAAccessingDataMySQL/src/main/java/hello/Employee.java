package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Nguyễn Thanh Hương Lớp lưu trữ đối tượng Employee, ghi chú dưới dạng
 *         thực thể JPA
 */

@Entity // This tells Hibernate to make a table out of this class.(Entity JPA)
@Table(name = "Task")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String name;
	private double salary;

	public Employee() {
	}

	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee[id=%s,name='%s',salary='%d']", id,name,salary);
	}
	
}
