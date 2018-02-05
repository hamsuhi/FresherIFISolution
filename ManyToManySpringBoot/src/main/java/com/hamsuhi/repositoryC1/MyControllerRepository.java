/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 31, 2018, Nguyen Thanh Huong 
 */
// package com.hamsuhi.repositoryC1;

// import java.util.ArrayList;
// import java.util.List;

// import javax.transaction.Transactional;

// import org.apache.log4j.LogManager;
// import org.apache.log4j.Logger;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;

// import com.hamsuhi.entity.Course;
// import com.hamsuhi.entity.Student;

// /**
//  * @author Nguyễn Thanh Hương
//  * 
//  *
//  */

// public class MyControllerRepository implements CommandLineRunner {
// 	public static final Logger log = LogManager.getLogger(MyControllerRepository.class);
// 	@Autowired
// 	private IStudentRepository studentRepository;
// 	@Autowired
// 	private ICourseRepository courseRepository;

// 	@Transactional
// 	@Override
// 	public void run(String... args) {
	
// 		// Add record in mysql
// 		System.out.println("_________________Add record in mysql___________________");
// 		Course course1 = new Course("Design Photography", 330);
// 		log.info(course1.getCourseName());
// 		Course course2 = new Course("Paint by hand", 210);
// 		Course course3 = new Course("Cooking in kitchen", 410);

			
// 		List<Course> course = new ArrayList<Course>();
// 		Student student1 = new Student("Lan", "Ha noi", "093724923");
// 		Student student2 = new Student("Hue", "yen Bai", "093232324");
// 		course.add(course1);
// 		course.add(course2);
// 		course.add(course3);

// 		List<Student> student = new ArrayList<Student>();
// 		student.add(student1);
// 		student.add(student2);

// 		course1.setStudents(student);
// 		course2.setStudents(student);
		
// 		student1.setCourses(course);
// 		student2.setCourses(course);
		
// 		studentRepository.save(student1);
// 		studentRepository.save(student2);
		
		
// 		log.info("________Count:__________ " + studentRepository.count());
		
// 		// fetch all student
// 		//List<Student> student = studentRepository.findAll();
// 		log.info("______________________Show all informtion student_______________________");
// 		for (Student stu : studentRepository.findAll()) {
// 			log.info(" "+stu.getStudentId() +  stu.getAddress() + stu.getStudentName());
// 		}
		
// 		log.info("______________________________THE END_____________________________________");

		
// 	}

// }
