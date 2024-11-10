package com.hoanggiang.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SMSService implements IMessage {

    @Override
    public void sendMessage() {
        System.out.println("Send Message By SMS");
    }
}
