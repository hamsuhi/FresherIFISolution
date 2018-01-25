package com.demo1.spring.main;

import org.springframework.boot.SpringApplication;

import com.demo1.config.AppConfig;

/*
 * Bạn tạo một đối tượng ApplicationContext bằng cách đọc các cấu hình trong class AppConfiguration
 */
public class main {
	public static void main(String[] args) {
		// Tạo ra một đối tượng ApplicationContext bằng cách đọc cấu hỉnh
		// trong AppConfiguration.class
		SpringApplication.run(AppConfig.class, args);
	}
}
