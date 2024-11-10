package com.hoanggiang.demo.controllers;

import com.hoanggiang.demo.services.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping()
    public void printMessage() {
        demoService.printMessage();
    }
}
