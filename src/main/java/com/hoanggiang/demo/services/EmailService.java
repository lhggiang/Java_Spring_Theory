package com.hoanggiang.demo.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IMessage {
    public EmailService() {
        System.out.println("Email Service created");
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("Email Service initialized");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Email Service destroyed");
//    }

    @Override
    public void sendMessage() {
        System.out.println("Send Message By Email");
    }
}
