package com.minato.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.minato.springboot.entity.Developer;
import com.minato.springboot.entity.Project;
import com.minato.springboot.repository.DevProjectJPA;
import com.minato.springboot.repository.DevRepositoryJPA;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private static final Logger log = LogManager.getLogger();
	@Autowired
	private DevRepositoryJPA devRepositoryJPA;
	
	@Autowired
	private DevProjectJPA devRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		System.out.println("=====================================================================");
		Developer d1 = new Developer();
		d1.setName("Nong Van Duc"); // 1

		System.out.println(d1.getName());
		Developer d2 = new Developer();
		d2.setName("Kushina"); // 4

		Project p1 = new Project();
		Project p2 = new Project();
		p1.setName("Spring"); // 2
		p2.setName("Hibernate");// 3

		List<Project> projects = new ArrayList<Project>();
		projects.add(p1);
		projects.add(p2);

		List<Developer> dev = new ArrayList<Developer>();
		dev.add(d1);
		dev.add(d2);

		p1.setDevelopers(dev);
		p2.setDevelopers(dev);

		d1.setProjects(projects);
		d2.setProjects(projects);

		devRepositoryJPA.save(d1);
		devRepositoryJPA.save(d2);
		
		//devRepositoryJPA.flush();
		for (Project pj : devRepository.findAll()) {
			log.info("---------Thong tin project: " + pj.getId());
		}

		for (Developer nb : devRepositoryJPA.findAll()) {
			log.info("___Thong tin : " + nb.getId() + nb.getName() + nb.getProjects());
		}

		System.out.println("=====================================================================");
	}

}
