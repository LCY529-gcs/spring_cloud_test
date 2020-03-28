package com.cy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HystrixMain80 {
    public static void main(String[] args){
        SpringApplication.run(HystrixMain80.class,args);
    }

}
