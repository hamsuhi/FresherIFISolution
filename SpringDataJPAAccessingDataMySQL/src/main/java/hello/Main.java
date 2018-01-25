/**
 * Copyright(C) 2018 IFI Solution
 * TenClass.java, Jan 25, 2018, Nguyen Thanh Huong 
 */
package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Nguyễn Thanh Hương
 * 
 *
 */
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(MainController.class, args);
	}
}
