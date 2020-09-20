package com.ethan.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName : PaymentFallbackService
 * @Author : ethan
 * @Date: 2020-09-20 16:27
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK，/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_Timeout，/(ㄒoㄒ)/~~";

    }
}
