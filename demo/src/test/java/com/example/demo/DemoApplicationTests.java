package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo1.service.ImpLanguage;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("English")
public class DemoApplicationTests {
	private static final Logger logger = LogManager.getLogger(DemoApplicationTests.class);

	@Autowired
	public ImpLanguage language;

	@Test
	public void contextLoads() {
		String output = language.getGreeting();
		assertThat(output).contains("Hello");
	}

}
