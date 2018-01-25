package com.demo1.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"English","default"})
public class English implements ImpLanguage {

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Welcome VietNam!";
	}

	@Override
	public String getBye() {
		// TODO Auto-generated method stub
		return "Say Good bye VietNam!";
	}

}
