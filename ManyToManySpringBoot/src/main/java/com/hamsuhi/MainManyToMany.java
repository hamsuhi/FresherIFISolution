package com.hamsuhi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hamsuhi.entity.Course;
import com.hamsuhi.entity.Student;
import com.hamsuhi.repositoryC1.ICourseRepository;
import com.hamsuhi.repositoryC1.IStudentRepository;

@SpringBootApplication
public class MainManyToMany implements CommandLineRunner {
	public static final Logger log = LogManager.getLogger(MainManyToMany.class);
	@Autowired
	private IStudentRepository studentRepository;
	@Autowired
	private ICourseRepository courseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MainManyToMany.class, args);
	}

	

	@Override
	@Transactional
	public void run(String... args) {
		// Add record in mysql
		log.info("_________________Add record in mysql___________________");
		Course course1 = new Course();
		course1.setCourseName("Design Photography");
		course1.setNumberHours(330);
		log.info(course1.getCourseName());
		Course course2 = new Course();
		course2.setCourseName("Paint by hand");
		course2.setNumberHours(210);
		Course course3 = new Course("Cooking in kitchen", 410);

//		Set<Course> course = new HashSet<>();
		List<Course> course = new ArrayList<>();
		Student student1 = new Student("Lan", "Ha noi", "093724923");
		Student student2 = new Student("Hue", "yen Bai", "093232324");
		course.add(course1);
		course.add(course2);
		course.add(course3);

//		Set<Student> student = new HashSet<>();
		List<Student> student = new ArrayList<>();
		student.add(student1);
		student.add(student2);

		student1.setCourses(course);
		student2.setCourses(course);

		course1.setStudents(student);
		course2.setStudents(student);

		studentRepository.save(student1);
		studentRepository.save(student2);

		log.info("________Count:__________ " + studentRepository.count());

		// fetch all student
		// List<Student> student = studentRepository.findAll();
		log.info("______________________Show all informtion student_______________________");
		for (Student stu : studentRepository.findAll()) {
			log.info(" " + stu.getId() + stu.getAddress() + stu.getStudentName());
		}

		log.info("______________________________THE END_____________________________________");
	}
}
