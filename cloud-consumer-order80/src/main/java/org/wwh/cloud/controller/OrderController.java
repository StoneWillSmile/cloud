package org.wwh.cloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.wwh.cloud.po.Payment;
import org.wwh.cloud.vo.CommonResult;

import javax.annotation.Resource;

/**
 * @author wwh
 * @date 2020/9/15 19:36
 */
@Api(tags = "消费者-80端口-订单模块：消费8001端口")
@RestController
@Slf4j
public class OrderController {

    private static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    RestTemplate restTemplate;

    @ApiOperation("创建")
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        System.out.println(payment);
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @ApiOperation("搜索")
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
