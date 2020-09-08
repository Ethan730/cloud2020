package com.ethan.service;

import com.ethan.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : PaymentService
 * @Author : ethan
 * @Date: 2020-09-08 14:05
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

