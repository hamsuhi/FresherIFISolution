/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 31, 2018, Nguyen Thanh Huong 
 */
package com.hamsuhi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Nguyễn Thanh Hương
 */
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;

	@Column(name = "course_name")
	private String courseName;

	@Column(name = "number_hours")
	private int numberHours;

	@ManyToMany(mappedBy = "courses")
//	private Set<Student> students = new HashSet<Student>();
	private List<Student> students;
	public Course() {
	}

	public Course(String courseName, int numberHours) {
		this.courseName = courseName;
		this.numberHours = numberHours;
	}

	public Course(String courseName, int numberHours, List<Student> students) {
		this.courseName = courseName;
		this.numberHours = numberHours;
		this.students = students;
	}
	

	public int getId() {
		return id;
	}
	//

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getNumberHours() {
		return numberHours;
	}

	public void setNumberHours(int numberHours) {
		this.numberHours = numberHours;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", numberHours=" + numberHours + "]";
	}


//	public Set<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(Set<Student> students) {
//		this.students = students;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	// public static void main(String[] args) {
	// Course c = new Course(21, "had", "56.9");
	// c.toString();
	// }
}
