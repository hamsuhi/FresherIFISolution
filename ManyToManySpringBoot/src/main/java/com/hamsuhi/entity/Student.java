/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 31, 2018, Nguyen Thanh Huong 
 */
package com.hamsuhi.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Nguyễn Thanh Hương
 */
@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "address")
	private String address;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "tel")
	private String tel;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "registration", joinColumns=@JoinColumn(name ="student_id"), inverseJoinColumns=@JoinColumn(name ="course_id"))
	// private Set<Course> courses;
	// private Set<Course> courses = new HashSet<>();
	private List<Course> courses;

	public Student() {

	}

	public Student(String studentName, String address, String tel) {
		this.studentName = studentName;
		this.address = address;
		this.tel = tel;
	}

	public Student(String studentName, String address, String tel, List<Course> courses) {
		this.studentName = studentName;
		this.address = address;
		this.tel = tel;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	// public Set<Course> getCourses() {
	// return courses;
	// }
	//
	// public void setCourses(Set<Course> courses) {
	// this.courses = courses;
	// }

	// @Override
	// public String toString() {
	// String result = String.format("Student[id=%d, name='%s',
	// address='%s',tel='%s']%n]", id, studentName,
	// address, tel);
	// if (courses != null) {
	// for (Course lstCourse : courses) {
	// result += String.format("Course[id=%d, name='%s',number_hourse='%s']%n ",
	// lstCourse.getCourseId(),
	// lstCourse.getCourseName(), lstCourse.getNumberHours());
	// }
	// }
	// return result;
	// }

}
