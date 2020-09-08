package com.ethan.service.impl;

import com.ethan.dao.PaymentDao;
import com.ethan.entity.Payment;
import com.ethan.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName : PaymentServiceImpl
 * @Author : ethan
 * @Date: 2020-09-08 11:29
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}