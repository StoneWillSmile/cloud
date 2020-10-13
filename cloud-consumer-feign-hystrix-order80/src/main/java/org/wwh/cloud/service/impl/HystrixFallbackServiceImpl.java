package org.wwh.cloud.service.impl;

import org.springframework.stereotype.Service;
import org.wwh.cloud.service.HystrixService;

/**
 * @author wwh
 * @date 2020/10/10 15:21
 */
@Service
public class HystrixFallbackServiceImpl implements HystrixService {

    @Override
    public String paymentInfoOk(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
