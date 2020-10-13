package org.wwh.cloud.service;

/**
 * @author wwh
 * @date 2020/9/30 16:18
 */
public interface PaymentService {

    String paymentInfoOk(Integer id);

    String paymentInfoTimeOut(Integer id);

    String paymentInfoTimeOutHandler(Integer id);

    public String paymentCircuitBreaker(Integer id);

    public String paymentCircuitBreakerFallback(Integer id);
}
