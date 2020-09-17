package org.wwh.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author wwh
 * @date 2020/9/14 15:36
 */
@SpringBootApplication
@MapperScan(basePackages = "org.wwh.cloud.dao")
public class PaymentMain8001 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
