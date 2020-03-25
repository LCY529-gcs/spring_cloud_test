package com.cy.springcloud.service;

import com.cy.springcloud.enties.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
