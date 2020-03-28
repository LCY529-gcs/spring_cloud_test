package com.cy.springcloud.controller;

import com.cy.springcloud.service.HystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class HystrixController {

    @Resource
    private HystrixService hystrixService;

    @GetMapping("/consumer/payment/hystrix/info")
    public String info(){
        return hystrixService.infoOk();
    }

    @GetMapping("/consumer/payment/hystrix/time")
    public String time(){
        return hystrixService.timeOut();
    }
}
