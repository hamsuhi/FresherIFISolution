/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 31, 2018, Nguyen Thanh Huong 
 */
package com.hamsuhi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
@Entity
@Table
public class Course {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer courseId;

	@Column(name = "course_name")
	private String courseName;

	@Column(name = "number_hours")
	private int numberHours;

	@ManyToMany(mappedBy = "courses")
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

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

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
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", numberHours=" + numberHours + "]";
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	// public static void main(String[] args) {
	// Course c = new Course(21, "had", "56.9");
	// c.toString();
	// }
}
