package com.cy.springcloud.controller;

import com.cy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @Value("server.port")
    private String port;

    @GetMapping("/payment/hystrix/info")
    public String infoOk(){
        return paymentService.info_ok();
    }

    @GetMapping("/payment/hystrix/time")
    public String timeOut(){
        return paymentService.timeOut();
    }
}
