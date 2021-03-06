package com.cy.springcloud.controller;

import com.cy.springcloud.enties.CommonResult;
import com.cy.springcloud.enties.Payment;
import com.cy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****" + result);

        if(result>0){
            return new CommonResult(200, "插入数据库成功"+serverPort, result);
        }else{
            return new CommonResult(444, "插入数据失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> create(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****" + payment);

        if(payment!=null){
            return new CommonResult(200, "查询成功"+serverPort, payment);
        }else{
            return new CommonResult(444, "查询失败:"+id, null);
        }
    }
}
