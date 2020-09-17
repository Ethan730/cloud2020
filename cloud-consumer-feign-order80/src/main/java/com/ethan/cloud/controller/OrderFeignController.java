package com.ethan.cloud.controller;

import com.ethan.cloud.service.PaymentFeignService;
import com.ethan.entity.CommonResult;
import com.ethan.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : OrderFeignController
 * @Author : ethan
 * @Date: 2020-09-17 17:17
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        // 默认等待一秒
        return paymentFeignService.paymentFeignTimeout();
    }
}
