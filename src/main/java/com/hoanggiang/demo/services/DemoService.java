package com.hoanggiang.demo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    //Dependency Injection Constructor
    private final IMessage iMessage;

//    public DemoService(@Qualifier("emailService") IMessage iMessage) {
//        this.iMessage = iMessage;
//    }

    public DemoService(IMessage iMessage) {
        this.iMessage = iMessage;
    }

    public void printMessage(){
        iMessage.sendMessage();
    }

}
