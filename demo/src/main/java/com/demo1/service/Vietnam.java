package com.demo1.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Vietnam")
public class Vietnam implements ImpLanguage{

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Xin chao Viet Nam";
	}

	@Override
	public String getBye() {
		// TODO Auto-generated method stub
		return "Tam biet Viet nam";
	}

}
