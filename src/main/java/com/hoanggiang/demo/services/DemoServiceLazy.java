package com.hoanggiang.demo.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DemoServiceLazy {
    private final IMessage iMessage1;
    private final IMessage iMessage2;

    public DemoServiceLazy(IMessage iMessage1,IMessage iMessage2) {
        this.iMessage1 = iMessage1;
        this.iMessage2 = iMessage2;
    }

    public void printMessage(){
       if(iMessage1 == iMessage2){
           System.out.println("SINGLETON");
       } else {
           System.out.println("PROTOTYPE");
       }
    }
}
