package com.cy.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient("CLOUD-HYSTRIX-PAYMENT")
public interface HystrixService {

    @GetMapping("/payment/hystrix/info")
    String infoOk();

    @GetMapping("/payment/hystrix/time")
    String timeOut();
}
