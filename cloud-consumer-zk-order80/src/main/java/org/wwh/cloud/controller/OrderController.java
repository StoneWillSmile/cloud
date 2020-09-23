package org.wwh.cloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wwh
 * @date 2020/9/15 19:36
 */
@Api(tags = "消费者-订单模块-zk-80端口：消费8001端口")
@RestController
@Slf4j
public class OrderController {

    private static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    RestTemplate restTemplate;

    @ApiOperation("zk测试")
    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }
}
