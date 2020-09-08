package com.ethan.dao;

import com.ethan.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : PaymentDao
 * @Author : ethan
 * @Date: 2020-09-07 23:14
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
