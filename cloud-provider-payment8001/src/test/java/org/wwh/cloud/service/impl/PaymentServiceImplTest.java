package org.wwh.cloud.service.impl;

import org.wwh.cloud.po.Payment;
import org.wwh.cloud.service.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author wwh
 * @date 2020/9/14 19:32
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PaymentServiceImplTest {

    @Resource
    PaymentService paymentService;

    @Test
    public void getPaymentById() {
        Payment payment = paymentService.getPaymentById(1L);
        System.out.println(payment);
    }
}