package com.ifi.service;

import javax.xml.ws.RequestWrapper;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("english")
public class EnglishService implements HelloWorldService {

    @Override
    public String helloWorld() {
        return "Hello world";
    }

}
