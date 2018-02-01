package com.minato.bean.entityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.minato.entity.User;

@Component
public class UserEntityManager implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(UserEntityManager.class);

	@Autowired
	private UserService userService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User minato = new User("MinatoService", "minatocool20119@gmail.com", 25);
		User kushina = new User("KushinaService", "kushinacool20119@gmail.com", 24);
		User naruto = new User("NarutoService", "narutocool20119@gmail.com", 3);
		userService.insert(minato);
		userService.insert(kushina);
		userService.insert(naruto);

		LOG.info("==================================================");
		LOG.info("****************** My Service ********************");
		LOG.info("==================================================");
		for (User user : userService.findAll()) {
			LOG.info(user.toString());
		}
		LOG.info("==================================================");
		LOG.info("Delete with MyService: ");
		userService.delete(2);
		LOG.info("Deleted id 2....");
		for (User user : userService.findAll()) {
			LOG.info(user.toString());
		}
		LOG.info("==================================================");
		
		LOG.info("Update user Naruto to Sasuke by MyService: ");
		User sasuke = new User("SasukeService", "sasukecool20119@gmail.com", 4);
		userService.update(naruto, sasuke);
		
		for (User user : userService.findAll()) {
			LOG.info(user.toString());
		}
		LOG.info("==================================================");
	}

}
