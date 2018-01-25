package com.demo1.service;

/*
 * Lúc này các Spring BEAN đã được tạo ra, và được chứa trong Spring IoC. Các trường của các Spring BEAN có chú thích bởi @Autowired sẽ được tiêm các giá trị vào, giống hình minh họa dưới đây:
 */
public interface ImpLanguage {

	public String getGreeting();

	public String getBye();
}
