package com.demo1.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo1.service.English;
import com.demo1.service.ImpLanguage;
import com.demo1.service.Vietnam;

/*
 * Spring sẽ tạo các Spring BEAN, theo các định nghĩa trong class AppConfiguration, (Chú ý: Class AppConfiguration phải được chú thích bởi @Configuration).
 */

//One annotation, it is comment in a class-> defied Spring Bean
@Configuration
// Talk for Spring packages to search other Spring Bean. Spring will scan
// packages for search
@ComponentScan({ "com.demo1.service" })
public class AppConfig implements CommandLineRunner {
	private final static Logger logger = LogManager.getLogger(AppConfig.class);
	@Autowired
	private ImpLanguage language;

	@Override
	public void run(String... args) throws Exception {
		logger.info(language.getGreeting() + "INFO");
		logger.debug(language.getGreeting() + "DEBUG");
		logger.error(language.getBye() + "ERROR");
		logger.fatal(language.getBye() + "FATAL");
	}

	// //@Bean(name ="language")
	// public ImpLanguage getLanguage() {
	// return new English();
	// }

	// Các Spring BEAN được tạo ra sẽ được quản lý trong Spring IoC Container (Bộ
	// chứa Spring IoC).
}
