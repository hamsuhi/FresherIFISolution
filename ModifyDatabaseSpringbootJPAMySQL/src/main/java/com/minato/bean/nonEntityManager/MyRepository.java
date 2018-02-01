package com.minato.bean.nonEntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.minato.entity.User;
import com.minato.interfac.ImpUserRepository;

@Component
//@Service
//@Repository
public class MyRepository implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(MyRepository.class);

	@Autowired
	private ImpUserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Count: " + userRepository.count());
		LOG.info("==================================================");
		LOG.info("****************** My Repository *****************");
		LOG.info("==================================================");
		
		User minato = new User("Minato", "minatocool20119@gmail.com", 25);
		User kushina = new User("Kushina", "kushinacool20119@gmail.com", 26);
		User naruto = new User("Naruto", "narutocool20119@gmail.com", 3);
		User sasuke = new User("Sasuke", "sasukecool20119@gmail.com", 3);
//		minato.setId(2L);
		userRepository.save(minato);
		userRepository.save(kushina);
		userRepository.save(naruto);
		userRepository.save(sasuke);
//
//		LOG.info("=================== Finding all ==================");
//		LOG.info("==================================================");
//		LOG.info(userRepository.findAll().toString());
//		
//		LOG.info("======================= For ======================");
		
//		LOG.info("==================================================");
		
		
		
//		userRepository.deleteAll();
//		LOG.info("Detete naruto: " + userRepository.findAll().toString());
		
//		userRepository.deleteById(3L);
//		LOG.info("Delete Id 2: " + userRepository.findAll().toString());
		
		for (User user: userRepository.findAll()) {
			LOG.info(user.toString());
		}
		LOG.info("Count: " + userRepository.count());
		LOG.info("==================================================");
	}

}
