/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 25, 2018, Nguyen Thanh Huong 
 */
package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
@SpringBootApplication
@EnableJpaRepositories
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
