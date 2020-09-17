package com.ethan.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : OrderZKController
 * @Author : ethan
 * @Date: 2020-09-15 21:52
 */
@RestController
@Slf4j
public class OrderZKController {
    @Autowired
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://consul-provider-payment";

    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(PAYMENT_URL+"/payment/consul", String.class);
        return result;
    }
}
