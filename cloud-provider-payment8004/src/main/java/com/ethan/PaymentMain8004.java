package com.ethan;

import com.ethan.entity.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : PaymentMain8004
 * @Author : ethan
 * @Date: 2020-09-14 22:38
 */
@SpringBootApplication
@EnableDiscoveryClient //用于使用consul或者zookeeper作为注册中心
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
