package com.hoanggiang.demo.controllers;

import com.hoanggiang.demo.services.DemoService;
import com.hoanggiang.demo.services.DemoServiceLazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final DemoService demoService;
    private final DemoServiceLazy demoServiceLazy;

    public DemoController(DemoService demoService, DemoServiceLazy demoServiceLazy) {
        this.demoService = demoService;
        this.demoServiceLazy = demoServiceLazy;
    }

    @GetMapping()
    public void printMessage() {
        demoService.printMessage();
    }

    @GetMapping("/print")
    public void printMessageLazy() {
        demoServiceLazy.printMessage();
    }
}
